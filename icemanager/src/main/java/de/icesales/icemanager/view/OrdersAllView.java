package de.icesales.icemanager.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import jakarta.annotation.PostConstruct;

@jakarta.inject.Named
@jakarta.faces.view.ViewScoped
public class OrdersAllView extends AbstractView implements Serializable {

	private List<OrderBase> orders = new ArrayList<OrderBase>();
	private int ordersSize;

	@PostConstruct
	public void postConstruct() {
		orders = getSessionData().getOrdersAll();
		ordersSize = orders.size();
	}

	public List<OrderBase> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderBase> orders) {
		this.orders = orders;
	}

	public int getOrdersSize() {
		return ordersSize;
	}

	public void setOrdersSize(int ordersSize) {
		this.ordersSize = ordersSize;
	}

}
