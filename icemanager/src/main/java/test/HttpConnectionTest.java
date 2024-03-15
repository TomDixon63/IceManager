package test;

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

public class HttpConnectionTest {

	final static String SEVDESK_ORDERS_URL = "https://my.sevdesk.de/api/v1/Order?status=200&embed=positions&token=4bf578db00dbd24146a33a72f2ab8272";

	public static void main(String[] args) {

		List<OrderBase> orderList = new ArrayList<OrderBase>();

		HttpClient httpClient = HttpClient.newHttpClient();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		// objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

		try {
			HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI(SEVDESK_ORDERS_URL)).build();
			HttpResponse<String> response = httpClient.send(getRequest, BodyHandlers.ofString());

			System.out.println(response.statusCode());
			// System.out.println(response.body());

			String noObjectsString = StringUtils.removeStart(response.body(), "{\"objects\":").trim();
			noObjectsString = StringUtils.removeEnd(noObjectsString, "}").trim();
			// System.out.println("noObjectsString -> " + noObjectsString);

			// Icemanager[] orders = objectMapper.readValue(noObjectsString,
			// Icemanager[].class);
			// System.out.println("Order[] ->" + Arrays.asList(orders));
			OrderBase[] orders = objectMapper.readValue(noObjectsString, OrderBase[].class);

			orderList = Arrays.asList(orders);

			for (OrderBase ice : orderList) {
				System.out.println(ice.getAddressName() + " " + ice.getDeliveryTerms());
			}

		} catch (URISyntaxException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
