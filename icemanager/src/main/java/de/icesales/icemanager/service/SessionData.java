package de.icesales.icemanager.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import de.icesales.icemanager.model.jsonschema2pojo.Stock;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;

@jakarta.inject.Named
@SessionScoped
public class SessionData implements Serializable {

	private List<OrderBase> ordersAll;
	private int ordersordersAllSize;

	private List<OrderBase> ordersToday;
	private int ordersTodaySize;

	private List<OrderBase> ordersTomorrow;
	private int ordersTomorrowSize;

	private List<OrderBase> ordersAfterTomorrow;
	private int ordersAfterTomorrowSize;

	private Stock stock;

	@PostConstruct
	public void postConstruct() {
		ordersAll = new ArrayList<OrderBase>();
		ordersToday = new ArrayList<OrderBase>();
		ordersTomorrow = new ArrayList<OrderBase>();
		ordersAfterTomorrow = new ArrayList<OrderBase>();
		stock = new Stock();
	}

	public List<OrderBase> getOrdersToday() {
		return ordersToday;
	}

	public void setOrdersToday(List<OrderBase> ordersToday) {
		this.ordersToday = ordersToday;
	}

	public List<OrderBase> getOrdersTomorrow() {
		return ordersTomorrow;
	}

	public void setOrdersTomorrow(List<OrderBase> ordersTomorrow) {
		this.ordersTomorrow = ordersTomorrow;
	}

	public int getOrdersTodaySize() {
		return ordersTodaySize;
	}

	public void setOrdersTodaySize(int ordersTodaySize) {
		this.ordersTodaySize = ordersTodaySize;
	}

	public int getOrdersTomorrowSize() {
		return ordersTomorrowSize;
	}

	public void setOrdersTomorrowSize(int ordersTomorrowSize) {
		this.ordersTomorrowSize = ordersTomorrowSize;
	}

	public List<OrderBase> getOrdersAll() {
		return ordersAll;
	}

	public void setOrdersAll(List<OrderBase> ordersAll) {
		this.ordersAll = ordersAll;
	}

	public int getOrdersordersAllSize() {
		return ordersordersAllSize;
	}

	public void setOrdersordersAllSize(int ordersordersAllSize) {
		this.ordersordersAllSize = ordersordersAllSize;
	}

	public List<OrderBase> getOrdersAfterTomorrow() {
		return ordersAfterTomorrow;
	}

	public void setOrdersAfterTomorrow(List<OrderBase> ordersAfterTomorrow) {
		this.ordersAfterTomorrow = ordersAfterTomorrow;
	}

	public int getOrdersAfterTomorrowSize() {
		return ordersAfterTomorrowSize;
	}

	public void setOrdersAfterTomorrowSize(int ordersAfterTomorrowSize) {
		this.ordersAfterTomorrowSize = ordersAfterTomorrowSize;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
