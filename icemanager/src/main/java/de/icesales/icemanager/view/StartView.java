package de.icesales.icemanager.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import de.icesales.icemanager.model.jsonschema2pojo.StockOverview;
import de.icesales.icemanager.service.OrdersWorker;
import de.icesales.icemanager.service.SevdeskService;
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

	List<StockOverview> stockOverviewList;

	public void init() {
		fetchOrders();
		calculateStock();
	}

	public void fetchOrders() {

		List<OrderBase> orders = new ArrayList<OrderBase>(); // all from sevdesk
		List<OrderBase> ordersAll = new ArrayList<OrderBase>(); // filtered orders from orders

		try {
			orders = sevdeskService.fetch();

			if (orders.isEmpty()) {
				facesContext.addMessage("",
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Keine Bestellungen vorhanden.", null));
				return;
			}
			ordersAll = ordersWorker.processOrdersAll(orders);

			getSessionData().setOrdersAll(ordersWorker.processOrdersAll(ordersAll));
			getSessionData().setOrdersToday(ordersWorker.processOrdersToday(ordersAll));
			getSessionData().setOrdersTomorrow(ordersWorker.processOrdersTommorow(ordersAll));
			getSessionData().setOrdersAfterTomorrow(ordersWorker.processOrdersAfterTommorow(ordersAll));
		} catch (Exception e) {
			e.printStackTrace();
			facesContext.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"SevDesk ist nicht erreichbar! Bitte später wieder versuchen.", null));

		}
	}

	private void calculateStock() {

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

}
