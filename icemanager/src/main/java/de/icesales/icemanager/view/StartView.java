package de.icesales.icemanager.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import de.icesales.icemanager.model.jsonschema2pojo.Position;
import de.icesales.icemanager.model.jsonschema2pojo.Stock;
import de.icesales.icemanager.model.jsonschema2pojo.StockOverview;
import de.icesales.icemanager.service.OrdersWorker;
import de.icesales.icemanager.service.SevdeskService;
import de.icesales.icemanager.service.StockService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import util.ProductsEnum;

@jakarta.inject.Named
@jakarta.faces.view.ViewScoped
public class StartView extends AbstractView implements Serializable {

	@Inject
	FacesContext facesContext;

	@Inject
	transient private OrdersWorker ordersWorker;

	@Inject
	transient private SevdeskService sevdeskService;

	@Inject
	transient StockService stockService;

	private Stock stock;

	List<StockOverview> stockOverviewList;

	List<OrderBase> ordersTodayProcessed;
	List<OrderBase> ordersTommorowProcessed;
	List<OrderBase> ordersAfterTommorowProcessed;
	List<OrderBase> ordersAllProcessed;

	private int ordersToday;
	private int ordersTommorow;
	private int ordersAfterTommorow;
	private int ordersAll;

	public void init() {

		ordersTodayProcessed = new ArrayList<OrderBase>();
		ordersTommorowProcessed = new ArrayList<OrderBase>();
		ordersAfterTommorowProcessed = new ArrayList<OrderBase>();
		ordersAllProcessed = new ArrayList<OrderBase>();

		fetchBestand();
		fetchOrders();
		calculateStock();
	}

	private void fetchBestand() {
		try {
			stock = stockService.readStock();
			getSessionData().setStock(stock);
		} catch (IOException e) {
			e.printStackTrace();
			facesContext.addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Lagerbestand konnte nicht gelesen werden!  ", null));
		}
	}

	private void fetchOrders() {

		List<OrderBase> orders = new ArrayList<OrderBase>(); // all from sevdesk

		try {
			orders = sevdeskService.fetch();

			if (orders.isEmpty()) {
				facesContext.addMessage("",
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Keine Bestellungen vorhanden.", null));
				return;
			}

			ordersAllProcessed = ordersWorker.processOrdersAll(orders);
			getSessionData().setOrdersAll(ordersAllProcessed);
			ordersAll = ordersAllProcessed.size();

			ordersTodayProcessed = ordersWorker.processOrdersToday(ordersAllProcessed);
			getSessionData().setOrdersToday(ordersTodayProcessed);
			ordersToday = ordersTodayProcessed.size();

			ordersTommorowProcessed = ordersWorker.processOrdersTommorow(ordersAllProcessed);
			getSessionData().setOrdersTomorrow(ordersTommorowProcessed);
			ordersTommorow = ordersTommorowProcessed.size();

			ordersAfterTommorowProcessed = ordersWorker.processOrdersAfterTommorow(ordersAllProcessed);
			getSessionData().setOrdersAfterTomorrow(ordersAfterTommorowProcessed);
			ordersAfterTommorow = ordersAfterTommorowProcessed.size();

		} catch (Exception e) {
			e.printStackTrace();
			facesContext.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"SevDesk ist nicht erreichbar! Bitte später wieder versuchen.", null));

		}
	}

	private void calculateStock() {

		initStockOverview();

		// StockOverview id0 = new StockOverview(0, ProductsEnum.W2B.getLabel(), 0, 0,
		// 0, 0, 0);

		for (List<StockOverview> list : Arrays.asList(stockOverviewList)) {

			if (list.get(0).getId() == 0) {

				// W2B
				list.get(0).setStockCount(stock.getW2BCount());

				if (!ordersTodayProcessed.isEmpty()) {
					int quantity = 0;
					for (OrderBase o : ordersTodayProcessed) {
						for (Position p : o.getPositions()) {
							if (StringUtils.equals(p.getName(), ProductsEnum.W2B.getLabel())) {
								quantity = quantity + Integer.parseInt(p.getQuantity());
								list.get(0).setCountToday(list.get(0).getStockCount() - quantity);
							}
						}
					}
				} else {
					list.get(0).setCountToday(list.get(0).getStockCount());
				}

				if (!ordersTommorowProcessed.isEmpty()) {
					int quantity = 0;
					for (OrderBase o : ordersTommorowProcessed) {
						for (Position p : o.getPositions()) {
							if (StringUtils.equals(p.getName(), ProductsEnum.W2B.getLabel())) {
								quantity = quantity + Integer.parseInt(p.getQuantity());
								list.get(0).setCountTomorrow(list.get(0).getCountToday() - quantity);
							}
						}
					}
				} else {
					list.get(0).setCountTomorrow(list.get(0).getCountToday());
				}

				if (!ordersAfterTommorowProcessed.isEmpty()) {
					int quantity = 0;
					for (OrderBase o : ordersAfterTommorowProcessed) {
						for (Position p : o.getPositions()) {
							if (StringUtils.equals(p.getName(), ProductsEnum.W2B.getLabel())) {
								quantity = quantity + Integer.parseInt(p.getQuantity());
								list.get(0).setCountAfterTomorrow(list.get(0).getCountTomorrow() - quantity);
							}
						}
					}
				} else {
					list.get(0).setCountAfterTomorrow(list.get(0).getCountTomorrow());
				}

				if (!ordersAllProcessed.isEmpty()) {
					int quantity = 0;
					for (OrderBase o : ordersAllProcessed) {
						for (Position p : o.getPositions()) {
							if (StringUtils.equals(p.getName(), ProductsEnum.W2B.getLabel())) {
								quantity = quantity + Integer.parseInt(p.getQuantity());
								list.get(0).setCountAll(list.get(0).getStockCount() - quantity);
							}
						}
					}
				}

				//////////////////////////////////////////////////////////////////////////////////////////////////////////////

				// W5B
				if (list.get(1).getId() == 1) {
					list.get(1).setStockCount(stock.getW5BCount());

					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(1).setCountToday(list.get(1).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(1).setCountToday(list.get(1).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(1).setCountTomorrow(list.get(1).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(1).setCountTomorrow(list.get(1).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(1).setCountAfterTomorrow(list.get(1).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(1).setCountAfterTomorrow(list.get(1).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(1).setCountAll(list.get(1).getStockCount() - quantity);
								}
							}
						}
					}
				}

				/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

				// W15B
				if (list.get(2).getId() == 2) {
					list.get(2).setStockCount(stock.getW15BCount());
					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(2).setCountToday(list.get(2).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(2).setCountToday(list.get(2).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(2).setCountTomorrow(list.get(2).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(2).setCountTomorrow(list.get(2).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(2).setCountAfterTomorrow(list.get(2).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(2).setCountAfterTomorrow(list.get(2).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.W15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(2).setCountAll(list.get(2).getStockCount() - quantity);
								}
							}
						}
					}

				}

				/////////////////////////////////////////////////////////////////////////////////////////////

				// WL
				if (list.get(3).getId() == 3) {
					list.get(3).setStockCount(stock.getWlCount());

					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.WL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(3).setCountToday(list.get(3).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(3).setCountToday(list.get(3).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.WL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(3).setCountTomorrow(list.get(3).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(3).setCountTomorrow(list.get(3).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.WL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(3).setCountAfterTomorrow(list.get(3).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(3).setCountAfterTomorrow(list.get(3).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.WL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(3).setCountAll(list.get(3).getStockCount() - quantity);
								}
							}
						}
					}

				}

				////////////////////////////////////////////////////////////////////////////////////////////////////
				// C2B

				if (list.get(4).getId() == 4) {
					list.get(4).setStockCount(stock.getC2BCount());

					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C2B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(4).setCountToday(list.get(4).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(4).setCountToday(list.get(4).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C2B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(4).setCountTomorrow(list.get(4).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(4).setCountTomorrow(list.get(4).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C2B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(4).setCountAfterTomorrow(list.get(4).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(4).setCountAfterTomorrow(list.get(4).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C2B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(4).setCountAll(list.get(4).getStockCount() - quantity);
								}
							}
						}
					}

				}

				////////////////////////////////////////////////////////////////////////////////////////////////////
				// C5B
				if (list.get(5).getId() == 5) {
					list.get(5).setStockCount(stock.getC5BCount());

					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(5).setCountToday(list.get(5).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(5).setCountToday(list.get(5).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(5).setCountTomorrow(list.get(5).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(5).setCountTomorrow(list.get(5).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(5).setCountAfterTomorrow(list.get(5).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(5).setCountAfterTomorrow(list.get(5).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C5B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(5).setCountAll(list.get(5).getStockCount() - quantity);
								}
							}
						}
					}

				}

				////////////////////////////////////////////////////////////////////////////////////////////////////
				// C15B
				if (list.get(6).getId() == 6) {
					list.get(6).setStockCount(stock.getC15BCount());

					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(6).setCountToday(list.get(6).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(6).setCountToday(list.get(6).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(6).setCountTomorrow(list.get(6).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(6).setCountTomorrow(list.get(6).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(6).setCountAfterTomorrow(list.get(6).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(6).setCountAfterTomorrow(list.get(6).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.C15B.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(6).setCountAll(list.get(6).getStockCount() - quantity);
								}
							}
						}
					}

				}

				////////////////////////////////////////////////////////////////////////////////////////////////////
				// CL
				if (list.get(7).getId() == 7) {
					list.get(7).setStockCount(stock.getClCount());

					if (!ordersTodayProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTodayProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.CL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(7).setCountToday(list.get(7).getStockCount() - quantity);
								}
							}
						}
					} else {
						list.get(7).setCountToday(list.get(7).getStockCount());
					}

					if (!ordersTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.CL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(7).setCountTomorrow(list.get(7).getCountToday() - quantity);
								}
							}
						}
					} else {
						list.get(7).setCountTomorrow(list.get(7).getCountToday());
					}

					if (!ordersAfterTommorowProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAfterTommorowProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.CL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(7).setCountAfterTomorrow(list.get(7).getCountTomorrow() - quantity);
								}
							}
						}
					} else {
						list.get(7).setCountAfterTomorrow(list.get(7).getCountTomorrow());
					}

					if (!ordersAllProcessed.isEmpty()) {
						int quantity = 0;
						for (OrderBase o : ordersAllProcessed) {
							for (Position p : o.getPositions()) {
								if (StringUtils.equals(p.getName(), ProductsEnum.CL.getLabel())) {
									quantity = quantity + Integer.parseInt(p.getQuantity());
									list.get(7).setCountAll(list.get(7).getStockCount() - quantity);
								}
							}
						}
					}
				}
			}
		}

	}

	private void initStockOverview() {
		stockOverviewList = new ArrayList<StockOverview>();

		StockOverview id0 = new StockOverview(0, ProductsEnum.W2B.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id0);

		StockOverview id1 = new StockOverview(1, ProductsEnum.W5B.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id1);

		StockOverview id2 = new StockOverview(2, ProductsEnum.W15B.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id2);

		StockOverview id3 = new StockOverview(3, ProductsEnum.WL.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id3);

		StockOverview id4 = new StockOverview(4, ProductsEnum.C2B.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id4);

		StockOverview id5 = new StockOverview(5, ProductsEnum.C5B.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id5);

		StockOverview id6 = new StockOverview(6, ProductsEnum.C15B.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id6);

		StockOverview id7 = new StockOverview(7, ProductsEnum.CL.getLabel(), 0, 0, 0, 0, 0);
		stockOverviewList.add(id7);
	}

	public List<StockOverview> getStockOverviewList() {
		return stockOverviewList;
	}

	public void setStockOverviewList(List<StockOverview> stockOverviewList) {
		this.stockOverviewList = stockOverviewList;
	}

	public int getOrdersToday() {
		return ordersToday;
	}

	public void setOrdersToday(int ordersToday) {
		this.ordersToday = ordersToday;
	}

	public int getOrdersTommorow() {
		return ordersTommorow;
	}

	public void setOrdersTommorow(int ordersTommorow) {
		this.ordersTommorow = ordersTommorow;
	}

	public int getOrdersAfterTommorow() {
		return ordersAfterTommorow;
	}

	public void setOrdersAfterTommorow(int ordersAfterTommorow) {
		this.ordersAfterTommorow = ordersAfterTommorow;
	}

	public int getOrdersAll() {
		return ordersAll;
	}

	public void setOrdersAll(int ordersAll) {
		this.ordersAll = ordersAll;
	}

}
