package de.icesales.icemanager.model.jsonschema2pojo;

import java.io.Serializable;

public class StockOverview implements Serializable {

	private int id;

	private String product;

	private int stockCount;

	private int countToday;

	private int countTomorrow;

	private int countAfterTomorrow;

	private int count7days;

	private int countAll;

	public StockOverview() {

	}

	public StockOverview(int id, String product, int stockCount, int countToday, int countTomorrow,
			int countAfterTomorrow, int count7days, int countAll) {
		super();
		this.id = id;
		this.product = product;
		this.stockCount = stockCount;
		this.countToday = countToday;
		this.countTomorrow = countTomorrow;
		this.countAfterTomorrow = countAfterTomorrow;
		this.count7days = count7days;
		this.countAll = countAll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public int getCountToday() {
		return countToday;
	}

	public void setCountToday(int countToday) {
		this.countToday = countToday;
	}

	public int getCountTomorrow() {
		return countTomorrow;
	}

	public void setCountTomorrow(int countTomorrow) {
		this.countTomorrow = countTomorrow;
	}

	public int getCountAfterTomorrow() {
		return countAfterTomorrow;
	}

	public void setCountAfterTomorrow(int countAfterTomorrow) {
		this.countAfterTomorrow = countAfterTomorrow;
	}

	public int getCountAll() {
		return countAll;
	}

	public void setCountAll(int countAll) {
		this.countAll = countAll;
	}

	public int getCount7days() {
		return count7days;
	}

	public void setCount7days(int count7days) {
		this.count7days = count7days;
	}

}
