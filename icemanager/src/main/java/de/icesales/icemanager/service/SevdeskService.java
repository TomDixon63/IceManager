package de.icesales.icemanager.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;

public class SevdeskService {

	// final static String SEVDESK_ORDERS_URL =
	// "https://my.sevdesk.de/api/v1/Order?status=200&embed=positions&token=4bf578db00dbd24146a33a72f2ab8272";
	// TODO check!
	final static String SEVDESK_ORDERS_URL = "https://my.sevdesk.de/api/v1/Order?embed=positions&token=4bf578db00dbd24146a33a72f2ab8272";

	public List<OrderBase> fetch() throws Exception {

		List<OrderBase> orderList = new ArrayList<OrderBase>();

		HttpClient httpClient = HttpClient.newHttpClient();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {
			HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI(SEVDESK_ORDERS_URL)).build();
			HttpResponse<String> response = httpClient.send(getRequest, BodyHandlers.ofString());

			String noObjectsString = StringUtils.removeStart(response.body(), "{\"objects\":").trim();
			noObjectsString = StringUtils.removeEnd(noObjectsString, "}").trim();

			OrderBase[] orders = objectMapper.readValue(noObjectsString, OrderBase[].class);

			orderList = Arrays.asList(orders);

		} catch (URISyntaxException | IOException | InterruptedException e) {
			e.printStackTrace();
			throw new Exception("Sevdesk nicht verfügbar!");
		}

		return orderList;
	}

}
