package de.icesales.icemanager.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import de.icesales.icemanager.service.OrdersWorker;
import de.icesales.icemanager.service.SevdeskService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;

@jakarta.inject.Named
@jakarta.faces.view.ViewScoped
public class StartView extends AbstractView implements Serializable {

	@Inject
	FacesContext facesContext;

	@Inject
	transient private OrdersWorker ordersWorker;

	@Inject
	transient private SevdeskService sevdeskService;

	public void init() {
		fetchOrders();
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

}
