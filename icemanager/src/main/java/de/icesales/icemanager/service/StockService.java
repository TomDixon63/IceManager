package de.icesales.icemanager.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.icesales.icemanager.model.jsonschema2pojo.Stock;

public class StockService {

	private final static String FILE_PATH = "C:\\icemanager\\lagerbestand.json";

	public Stock readStock() throws IOException {

		Stock stock = new Stock();

		ObjectMapper mapper = new ObjectMapper();

		InputStream inputStream = new FileInputStream(FILE_PATH);
		Map<String, Object> jsonMap = mapper.readValue(inputStream, Map.class);
		stock = mapper.convertValue(jsonMap, Stock.class);
		return stock;
	}

	public void saveStock(Stock stock) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(new FileOutputStream(FILE_PATH), stock);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
