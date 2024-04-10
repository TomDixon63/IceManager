package de.icesales.icemanager.view;

import java.io.IOException;
import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import de.icesales.icemanager.model.jsonschema2pojo.Stock;
import de.icesales.icemanager.service.StockService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import util.Util;

@jakarta.inject.Named
@jakarta.faces.view.ViewScoped
public class StockView extends AbstractView implements Serializable {

	@Inject
	FacesContext facesContext;

	@Inject
	transient StockService stockService;

	private Stock stock;

	@PostConstruct
	public void postConstruct() {
		readStock();
	}

	public void actionSave() {
		saveStock();
	}

	private void saveStock() {
		String lastUpdate = StringUtils.remove(Util.getLocalDateTodayNowAsString(), ".");
		try {
			stock.setLastupdate(lastUpdate);
			stockService.saveStock(stock);
			getSessionData().setStock(stock);

			facesContext.addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Lagerbestand gespeichert!  ", null));
		} catch (Exception e) {
			e.printStackTrace();
			facesContext.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Lagerbestand konnte nicht gespeichert werden!  ", null));
		}

	}

	@SuppressWarnings("unchecked")
	private void readStock() {

		try {
			stock = stockService.readStock();
			getSessionData().setStock(stock);
		} catch (IOException e) {
			e.printStackTrace();
			facesContext.addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Lagerbestand konnte nicht gelesen werden!  ", null));
		}
	}

	public String getLastUpdate() {
		if (stock == null || StringUtils.isEmpty(stock.getLastupdate())) {
			return "";
		}
		// String lu = String.valueOf(stock.getLastupdate());
		String lu = stock.getLastupdate();
		String day = lu.substring(0, 2);
		String month = lu.substring(2, 4);
		String year = lu.substring(4, 8);
		String lun = day + "." + month + "." + year;
		return lun;

	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
