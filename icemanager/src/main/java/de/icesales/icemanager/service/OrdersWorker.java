package de.icesales.icemanager.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import de.icesales.icemanager.model.jsonschema2pojo.Position;
import util.Constants;

public class OrdersWorker {

	private LocalDate today;

	private DateTimeFormatter dateTimeFormatter;

	public OrdersWorker() {
		today = LocalDate.now();
		dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	}

	// all orders
	public List<OrderBase> processOrdersAll(List<OrderBase> orders) {

		if (orders.isEmpty())
			return orders;

		List<OrderBase> list = new ArrayList<OrderBase>();

		List<OrderBase> filteredList = filterOrders(orders);

		for (OrderBase o : filteredList) {
			LocalDate deliveryTermsDate = null;
			try {
				deliveryTermsDate = LocalDate.parse(o.getDeliveryTerms(), dateTimeFormatter);
				if (!deliveryTermsDate.isBefore(today))
					list.add(o);

			} catch (DateTimeParseException e) {
				// TODO replace with log
				// e.printStackTrace();
				// System.out.println("DateTimeParseException -> " + o.getAddress());
			}
		}
		return list;
	}

	// orders today
	public List<OrderBase> processOrdersToday(List<OrderBase> orders) {

		if (orders.isEmpty())
			return orders;

		List<OrderBase> list = new ArrayList<OrderBase>();

		List<OrderBase> filteredList = filterOrders(orders);

		for (OrderBase o : filteredList) {
			LocalDate deliveryTermsDate = null;
			try {
				deliveryTermsDate = LocalDate.parse(o.getDeliveryTerms(), dateTimeFormatter);
				if (deliveryTermsDate.isEqual(today))
					list.add(o);

			} catch (DateTimeParseException e) {
				// TODO replace with log
				e.printStackTrace();
				System.out.println("DateTimeParseException -> " + o.getAddress());
			}
		}
		return list;
	}

	// orders tommorow
	public List<OrderBase> processOrdersTommorow(List<OrderBase> orders) {

		List<OrderBase> list = new ArrayList<OrderBase>();

		List<OrderBase> filteredList = filterOrders(orders);

		for (OrderBase o : filteredList) {
			LocalDate deliveryTermsDate = null;
			try {
				deliveryTermsDate = LocalDate.parse(o.getDeliveryTerms(), dateTimeFormatter);
				if (deliveryTermsDate.isEqual(today.plusDays(1)))
					list.add(o);

			} catch (DateTimeParseException e) {
				// TODO replace with log
				e.printStackTrace();
				System.out.println("DateTimeParseException -> " + o.getAddress());
			}
		}
		return list;
	}

	// orders after tommorow
	public List<OrderBase> processOrdersAfterTommorow(List<OrderBase> orders) {

		List<OrderBase> list = new ArrayList<OrderBase>();

		List<OrderBase> filteredList = filterOrders(orders);

		for (OrderBase o : filteredList) {
			LocalDate deliveryTermsDate = null;
			try {
				deliveryTermsDate = LocalDate.parse(o.getDeliveryTerms(), dateTimeFormatter);
				if (deliveryTermsDate.isEqual(today.plusDays(2)))
					list.add(o);

			} catch (DateTimeParseException e) {
				// TODO replace with log
				e.printStackTrace();
				System.out.println("DateTimeParseException -> " + o.getAddress());
			}
		}
		return list;
	}

	// only orders with orderNumber "AB-" and deliveryTerms
	private List<OrderBase> filterOrders(List<OrderBase> orders) {
		List<OrderBase> list = new ArrayList<OrderBase>();

		if (orders.isEmpty())
			return list;

		for (OrderBase o : orders) {

			if (StringUtils.isEmpty(o.getOrderNumber()))
				continue;

			if (!StringUtils.startsWith(o.getOrderNumber(), Constants.AB))
				continue;

			if (StringUtils.isEmpty(o.getDeliveryTerms()))
				continue;

			String dt = StringUtils.left(o.getDeliveryTerms(), 10);
			o.setDeliveryTerms(dt);

			if (!o.getPositions().isEmpty()) {
				for (Position p : o.getPositions()) {
					String pn = inkrementPositionNumber(p.getPositionNumber());
					p.setPositionNumberInc(pn);
				}
			}

			list.add(o);
		}
		return list;

	}

	private String inkrementPositionNumber(String positionNumber) {
		if (StringUtils.isEmpty(positionNumber))
			return "";

		try {
			Integer n = Integer.parseInt(positionNumber) + 1;
			return n.toString();
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return "";
		}
	}

}
