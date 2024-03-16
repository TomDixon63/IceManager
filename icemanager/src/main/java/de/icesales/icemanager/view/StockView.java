package de.icesales.icemanager.view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.icesales.icemanager.model.jsonschema2pojo.Stock;
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

	private Stock model;

	private final static String FILE_PATH = "C:\\icemanager\\lagerbestand.json";

	@PostConstruct
	public void postConstruct() {
		model = new Stock();
		read();
	}

	public void actionSave() {
		save();
	}

	private void save() {
		ObjectMapper mapper = new ObjectMapper();

		System.out.println(Util.getLocalDateTodayNowAsString());

		try {
			String lastUpdate = StringUtils.remove(Util.getLocalDateTodayNowAsString(), ".");
			System.out.println(lastUpdate);
			int lastUpdateAsInt = Integer.parseInt(lastUpdate);
			model.setLastupdate(lastUpdateAsInt);
			mapper.writeValue(new FileOutputStream(FILE_PATH), model);
			facesContext.addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Lagerbestand gespeichert!  ", null));
		} catch (IOException e) {
			e.printStackTrace();
			facesContext.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Lagerbestand konnte nicht gespeichert werden!  ", null));
		}

	}

	@SuppressWarnings("unchecked")
	private void read() {

		ObjectMapper mapper = new ObjectMapper();

		try {
			InputStream inputStream = new FileInputStream(FILE_PATH);
			Map<String, Object> jsonMap = mapper.readValue(inputStream, Map.class);
			model = mapper.convertValue(jsonMap, Stock.class);

		} catch (IOException e) {
			e.printStackTrace();
			facesContext.addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Lagerbestand konnte nicht gelesen werden!  ", null));
		}

	}

	public String getLastUpdate() {
		String lu = String.valueOf(model.getLastupdate());
		String day = lu.substring(0, 2);
		String month = lu.substring(2, 4);
		String year = lu.substring(4, 8);
		String lun = day + "." + month + "." + year;
		return lun;

	}

	public Stock getModel() {
		return model;
	}

	public void setModel(Stock model) {
		this.model = model;
	}

}
