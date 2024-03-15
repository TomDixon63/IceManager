package de.icesales.icemanager.view;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Map;

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
		write();
	}

	private void write() {
		ObjectMapper mapper = new ObjectMapper();
//		String contextpath = facesContext.getExternalContext().getRequestContextPath();
//		String filePath = contextpath + "/WEB-INF/lagerbestand.json";

		System.out.println(Util.getLocalDateTodayNowAsString());

		try {
			// Java object to JSON file
			mapper.writeValue(new File(FILE_PATH), model);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Java object to JSON string
		// String jsonString = mapper.writeValueAsString(object);
		// Files.copy(jsonString, file, StandardCopyOption.REPLACE_EXISTING);

	}

	@SuppressWarnings("unchecked")
	private void read() {

		ObjectMapper mapper = new ObjectMapper();

		try {
			InputStream inputStream = facesContext.getExternalContext().getResourceAsStream(FILE_PATH);
			Map<String, Object> jsonMap = mapper.readValue(inputStream, Map.class);
			model = mapper.convertValue(jsonMap, Stock.class);
			System.out.println(model.toString());

		} catch (IOException e) {
			e.printStackTrace();
			facesContext.addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Lagerbestand konnte nicht gelesen werden!  ", null));
		}

		/*
		 * File file = new File("/path/to/file.ext"); String fileName = file.getName();
		 * String contentType =facesContext.getExternalContext().getMimeType(fileName);
		 * int contentLength = (int) file.length();
		 * 
		 * 
		 * 
		 * Files.copy(file.toPath(), output);
		 */

//		File file = new File(this.getClass().getClassLoader().getResource("lagerbestand.json").getFile());
//	
//		try {
//			ProductsModel model = mapper.readValue(file, ProductsModel.class);
//			System.out.println(model.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	public Stock getModel() {
		return model;
	}

	public void setModel(Stock model) {
		this.model = model;
	}

}
