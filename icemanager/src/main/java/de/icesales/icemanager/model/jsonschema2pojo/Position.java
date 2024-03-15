
package de.icesales.icemanager.model.jsonschema2pojo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "objectName", "additionalInformation", "create", "update", "order", "part", "quantity",
		"price", "priceNet", "priceTax", "priceGross", "name", "priority", "unity", "sevClient", "positionNumber",
		"text", "discount", "isPercentage", "discountedValue", "optional", "optionalChargeable", "taxRate", "sumNet",
		"sumGross", "sumTax", "sumDiscount", "sumNetForeignCurrency", "sumTaxForeignCurrency",
		"sumGrossForeignCurrency", "sumDiscountForeignCurrency", "createNextPart" })
@Generated("jsonschema2pojo")
public class Position implements Serializable {

	private String positionNumberInc;

	@JsonProperty("id")
	private String id;
	@JsonProperty("objectName")
	private String objectName;
	@JsonProperty("additionalInformation")
	private Object additionalInformation;
	@JsonProperty("create")
	private String create;
	@JsonProperty("update")
	private String update;
	@JsonProperty("order")
	private Order order;
	@JsonProperty("part")
	private Part part;
	@JsonProperty("quantity")
	private String quantity;
	@JsonProperty("price")
	private String price;
	@JsonProperty("priceNet")
	private String priceNet;
	@JsonProperty("priceTax")
	private String priceTax;
	@JsonProperty("priceGross")
	private String priceGross;
	@JsonProperty("name")
	private String name;
	@JsonProperty("priority")
	private String priority;
	@JsonProperty("unity")
	private Unity unity;
	@JsonProperty("sevClient")
	private SevClient__1 sevClient;
	@JsonProperty("positionNumber")
	private String positionNumber;
	@JsonProperty("text")
	private String text;
	@JsonProperty("discount")
	private String discount;
	@JsonProperty("isPercentage")
	private String isPercentage;
	@JsonProperty("discountedValue")
	private Object discountedValue;
	@JsonProperty("optional")
	private String optional;
	@JsonProperty("optionalChargeable")
	private String optionalChargeable;
	@JsonProperty("taxRate")
	private String taxRate;
	@JsonProperty("sumNet")
	private String sumNet;
	@JsonProperty("sumGross")
	private String sumGross;
	@JsonProperty("sumTax")
	private String sumTax;
	@JsonProperty("sumDiscount")
	private String sumDiscount;
	@JsonProperty("sumNetForeignCurrency")
	private String sumNetForeignCurrency;
	@JsonProperty("sumTaxForeignCurrency")
	private String sumTaxForeignCurrency;
	@JsonProperty("sumGrossForeignCurrency")
	private String sumGrossForeignCurrency;
	@JsonProperty("sumDiscountForeignCurrency")
	private String sumDiscountForeignCurrency;
	@JsonProperty("createNextPart")
	private Object createNextPart;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	private final static long serialVersionUID = -1891345055011256753L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Position() {
	}

	/**
	 * 
	 * @param sumTax
	 * @param createNextPart
	 * @param part
	 * @param optionalChargeable
	 * @param sumGross
	 * @param update
	 * @param discount
	 * @param positionNumber
	 * @param priceNet
	 * @param priceGross
	 * @param unity
	 * @param sumTaxForeignCurrency
	 * @param sumGrossForeignCurrency
	 * @param price
	 * @param create
	 * @param sumNetForeignCurrency
	 * @param id
	 * @param text
	 * @param isPercentage
	 * @param order
	 * @param additionalInformation
	 * @param quantity
	 * @param sevClient
	 * @param optional
	 * @param sumDiscountForeignCurrency
	 * @param priority
	 * @param taxRate
	 * @param sumNet
	 * @param name
	 * @param discountedValue
	 * @param objectName
	 * @param priceTax
	 * @param sumDiscount
	 */
	public Position(String id, String objectName, Object additionalInformation, String create, String update,
			Order order, Part part, String quantity, String price, String priceNet, String priceTax, String priceGross,
			String name, String priority, Unity unity, SevClient__1 sevClient, String positionNumber,
			String positionNumberInc, String text, String discount, String isPercentage, Object discountedValue,
			String optional, String optionalChargeable, String taxRate, String sumNet, String sumGross, String sumTax,
			String sumDiscount, String sumNetForeignCurrency, String sumTaxForeignCurrency,
			String sumGrossForeignCurrency, String sumDiscountForeignCurrency, Object createNextPart) {
		super();
		this.id = id;
		this.objectName = objectName;
		this.additionalInformation = additionalInformation;
		this.create = create;
		this.update = update;
		this.order = order;
		this.part = part;
		this.quantity = quantity;
		this.price = price;
		this.priceNet = priceNet;
		this.priceTax = priceTax;
		this.priceGross = priceGross;
		this.name = name;
		this.priority = priority;
		this.unity = unity;
		this.sevClient = sevClient;
		this.positionNumber = positionNumber;
		this.text = text;
		this.discount = discount;
		this.isPercentage = isPercentage;
		this.discountedValue = discountedValue;
		this.optional = optional;
		this.optionalChargeable = optionalChargeable;
		this.taxRate = taxRate;
		this.sumNet = sumNet;
		this.sumGross = sumGross;
		this.sumTax = sumTax;
		this.sumDiscount = sumDiscount;
		this.sumNetForeignCurrency = sumNetForeignCurrency;
		this.sumTaxForeignCurrency = sumTaxForeignCurrency;
		this.sumGrossForeignCurrency = sumGrossForeignCurrency;
		this.sumDiscountForeignCurrency = sumDiscountForeignCurrency;
		this.createNextPart = createNextPart;
	}

	public String getPositionNumberInc() {
		return positionNumberInc;
	}

	public void setPositionNumberInc(String positionNumberInc) {
		this.positionNumberInc = positionNumberInc;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public Position withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("objectName")
	public String getObjectName() {
		return objectName;
	}

	@JsonProperty("objectName")
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public Position withObjectName(String objectName) {
		this.objectName = objectName;
		return this;
	}

	@JsonProperty("additionalInformation")
	public Object getAdditionalInformation() {
		return additionalInformation;
	}

	@JsonProperty("additionalInformation")
	public void setAdditionalInformation(Object additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public Position withAdditionalInformation(Object additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	@JsonProperty("create")
	public String getCreate() {
		return create;
	}

	@JsonProperty("create")
	public void setCreate(String create) {
		this.create = create;
	}

	public Position withCreate(String create) {
		this.create = create;
		return this;
	}

	@JsonProperty("update")
	public String getUpdate() {
		return update;
	}

	@JsonProperty("update")
	public void setUpdate(String update) {
		this.update = update;
	}

	public Position withUpdate(String update) {
		this.update = update;
		return this;
	}

	@JsonProperty("order")
	public Order getOrder() {
		return order;
	}

	@JsonProperty("order")
	public void setOrder(Order order) {
		this.order = order;
	}

	public Position withOrder(Order order) {
		this.order = order;
		return this;
	}

	@JsonProperty("part")
	public Part getPart() {
		return part;
	}

	@JsonProperty("part")
	public void setPart(Part part) {
		this.part = part;
	}

	public Position withPart(Part part) {
		this.part = part;
		return this;
	}

	@JsonProperty("quantity")
	public String getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Position withQuantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	public Position withPrice(String price) {
		this.price = price;
		return this;
	}

	@JsonProperty("priceNet")
	public String getPriceNet() {
		return priceNet;
	}

	@JsonProperty("priceNet")
	public void setPriceNet(String priceNet) {
		this.priceNet = priceNet;
	}

	public Position withPriceNet(String priceNet) {
		this.priceNet = priceNet;
		return this;
	}

	@JsonProperty("priceTax")
	public String getPriceTax() {
		return priceTax;
	}

	@JsonProperty("priceTax")
	public void setPriceTax(String priceTax) {
		this.priceTax = priceTax;
	}

	public Position withPriceTax(String priceTax) {
		this.priceTax = priceTax;
		return this;
	}

	@JsonProperty("priceGross")
	public String getPriceGross() {
		return priceGross;
	}

	@JsonProperty("priceGross")
	public void setPriceGross(String priceGross) {
		this.priceGross = priceGross;
	}

	public Position withPriceGross(String priceGross) {
		this.priceGross = priceGross;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Position withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("priority")
	public String getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Position withPriority(String priority) {
		this.priority = priority;
		return this;
	}

	@JsonProperty("unity")
	public Unity getUnity() {
		return unity;
	}

	@JsonProperty("unity")
	public void setUnity(Unity unity) {
		this.unity = unity;
	}

	public Position withUnity(Unity unity) {
		this.unity = unity;
		return this;
	}

	@JsonProperty("sevClient")
	public SevClient__1 getSevClient() {
		return sevClient;
	}

	@JsonProperty("sevClient")
	public void setSevClient(SevClient__1 sevClient) {
		this.sevClient = sevClient;
	}

	public Position withSevClient(SevClient__1 sevClient) {
		this.sevClient = sevClient;
		return this;
	}

	@JsonProperty("positionNumber")
	public String getPositionNumber() {
		return positionNumber;
	}

	@JsonProperty("positionNumber")
	public void setPositionNumber(String positionNumber) {
		this.positionNumber = positionNumber;
	}

	public Position withPositionNumber(String positionNumber) {
		this.positionNumber = positionNumber;
		return this;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	public Position withText(String text) {
		this.text = text;
		return this;
	}

	@JsonProperty("discount")
	public String getDiscount() {
		return discount;
	}

	@JsonProperty("discount")
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Position withDiscount(String discount) {
		this.discount = discount;
		return this;
	}

	@JsonProperty("isPercentage")
	public String getIsPercentage() {
		return isPercentage;
	}

	@JsonProperty("isPercentage")
	public void setIsPercentage(String isPercentage) {
		this.isPercentage = isPercentage;
	}

	public Position withIsPercentage(String isPercentage) {
		this.isPercentage = isPercentage;
		return this;
	}

	@JsonProperty("discountedValue")
	public Object getDiscountedValue() {
		return discountedValue;
	}

	@JsonProperty("discountedValue")
	public void setDiscountedValue(Object discountedValue) {
		this.discountedValue = discountedValue;
	}

	public Position withDiscountedValue(Object discountedValue) {
		this.discountedValue = discountedValue;
		return this;
	}

	@JsonProperty("optional")
	public String getOptional() {
		return optional;
	}

	@JsonProperty("optional")
	public void setOptional(String optional) {
		this.optional = optional;
	}

	public Position withOptional(String optional) {
		this.optional = optional;
		return this;
	}

	@JsonProperty("optionalChargeable")
	public String getOptionalChargeable() {
		return optionalChargeable;
	}

	@JsonProperty("optionalChargeable")
	public void setOptionalChargeable(String optionalChargeable) {
		this.optionalChargeable = optionalChargeable;
	}

	public Position withOptionalChargeable(String optionalChargeable) {
		this.optionalChargeable = optionalChargeable;
		return this;
	}

	@JsonProperty("taxRate")
	public String getTaxRate() {
		return taxRate;
	}

	@JsonProperty("taxRate")
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public Position withTaxRate(String taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	@JsonProperty("sumNet")
	public String getSumNet() {
		return sumNet;
	}

	@JsonProperty("sumNet")
	public void setSumNet(String sumNet) {
		this.sumNet = sumNet;
	}

	public Position withSumNet(String sumNet) {
		this.sumNet = sumNet;
		return this;
	}

	@JsonProperty("sumGross")
	public String getSumGross() {
		return sumGross;
	}

	@JsonProperty("sumGross")
	public void setSumGross(String sumGross) {
		this.sumGross = sumGross;
	}

	public Position withSumGross(String sumGross) {
		this.sumGross = sumGross;
		return this;
	}

	@JsonProperty("sumTax")
	public String getSumTax() {
		return sumTax;
	}

	@JsonProperty("sumTax")
	public void setSumTax(String sumTax) {
		this.sumTax = sumTax;
	}

	public Position withSumTax(String sumTax) {
		this.sumTax = sumTax;
		return this;
	}

	@JsonProperty("sumDiscount")
	public String getSumDiscount() {
		return sumDiscount;
	}

	@JsonProperty("sumDiscount")
	public void setSumDiscount(String sumDiscount) {
		this.sumDiscount = sumDiscount;
	}

	public Position withSumDiscount(String sumDiscount) {
		this.sumDiscount = sumDiscount;
		return this;
	}

	@JsonProperty("sumNetForeignCurrency")
	public String getSumNetForeignCurrency() {
		return sumNetForeignCurrency;
	}

	@JsonProperty("sumNetForeignCurrency")
	public void setSumNetForeignCurrency(String sumNetForeignCurrency) {
		this.sumNetForeignCurrency = sumNetForeignCurrency;
	}

	public Position withSumNetForeignCurrency(String sumNetForeignCurrency) {
		this.sumNetForeignCurrency = sumNetForeignCurrency;
		return this;
	}

	@JsonProperty("sumTaxForeignCurrency")
	public String getSumTaxForeignCurrency() {
		return sumTaxForeignCurrency;
	}

	@JsonProperty("sumTaxForeignCurrency")
	public void setSumTaxForeignCurrency(String sumTaxForeignCurrency) {
		this.sumTaxForeignCurrency = sumTaxForeignCurrency;
	}

	public Position withSumTaxForeignCurrency(String sumTaxForeignCurrency) {
		this.sumTaxForeignCurrency = sumTaxForeignCurrency;
		return this;
	}

	@JsonProperty("sumGrossForeignCurrency")
	public String getSumGrossForeignCurrency() {
		return sumGrossForeignCurrency;
	}

	@JsonProperty("sumGrossForeignCurrency")
	public void setSumGrossForeignCurrency(String sumGrossForeignCurrency) {
		this.sumGrossForeignCurrency = sumGrossForeignCurrency;
	}

	public Position withSumGrossForeignCurrency(String sumGrossForeignCurrency) {
		this.sumGrossForeignCurrency = sumGrossForeignCurrency;
		return this;
	}

	@JsonProperty("sumDiscountForeignCurrency")
	public String getSumDiscountForeignCurrency() {
		return sumDiscountForeignCurrency;
	}

	@JsonProperty("sumDiscountForeignCurrency")
	public void setSumDiscountForeignCurrency(String sumDiscountForeignCurrency) {
		this.sumDiscountForeignCurrency = sumDiscountForeignCurrency;
	}

	public Position withSumDiscountForeignCurrency(String sumDiscountForeignCurrency) {
		this.sumDiscountForeignCurrency = sumDiscountForeignCurrency;
		return this;
	}

	@JsonProperty("createNextPart")
	public Object getCreateNextPart() {
		return createNextPart;
	}

	@JsonProperty("createNextPart")
	public void setCreateNextPart(Object createNextPart) {
		this.createNextPart = createNextPart;
	}

	public Position withCreateNextPart(Object createNextPart) {
		this.createNextPart = createNextPart;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Position withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Position.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("objectName");
		sb.append('=');
		sb.append(((this.objectName == null) ? "<null>" : this.objectName));
		sb.append(',');
		sb.append("additionalInformation");
		sb.append('=');
		sb.append(((this.additionalInformation == null) ? "<null>" : this.additionalInformation));
		sb.append(',');
		sb.append("create");
		sb.append('=');
		sb.append(((this.create == null) ? "<null>" : this.create));
		sb.append(',');
		sb.append("update");
		sb.append('=');
		sb.append(((this.update == null) ? "<null>" : this.update));
		sb.append(',');
		sb.append("order");
		sb.append('=');
		sb.append(((this.order == null) ? "<null>" : this.order));
		sb.append(',');
		sb.append("part");
		sb.append('=');
		sb.append(((this.part == null) ? "<null>" : this.part));
		sb.append(',');
		sb.append("quantity");
		sb.append('=');
		sb.append(((this.quantity == null) ? "<null>" : this.quantity));
		sb.append(',');
		sb.append("price");
		sb.append('=');
		sb.append(((this.price == null) ? "<null>" : this.price));
		sb.append(',');
		sb.append("priceNet");
		sb.append('=');
		sb.append(((this.priceNet == null) ? "<null>" : this.priceNet));
		sb.append(',');
		sb.append("priceTax");
		sb.append('=');
		sb.append(((this.priceTax == null) ? "<null>" : this.priceTax));
		sb.append(',');
		sb.append("priceGross");
		sb.append('=');
		sb.append(((this.priceGross == null) ? "<null>" : this.priceGross));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("priority");
		sb.append('=');
		sb.append(((this.priority == null) ? "<null>" : this.priority));
		sb.append(',');
		sb.append("unity");
		sb.append('=');
		sb.append(((this.unity == null) ? "<null>" : this.unity));
		sb.append(',');
		sb.append("sevClient");
		sb.append('=');
		sb.append(((this.sevClient == null) ? "<null>" : this.sevClient));
		sb.append(',');
		sb.append("positionNumber");
		sb.append('=');
		sb.append(((this.positionNumber == null) ? "<null>" : this.positionNumber));
		sb.append(',');
		sb.append("text");
		sb.append('=');
		sb.append(((this.text == null) ? "<null>" : this.text));
		sb.append(',');
		sb.append("discount");
		sb.append('=');
		sb.append(((this.discount == null) ? "<null>" : this.discount));
		sb.append(',');
		sb.append("isPercentage");
		sb.append('=');
		sb.append(((this.isPercentage == null) ? "<null>" : this.isPercentage));
		sb.append(',');
		sb.append("discountedValue");
		sb.append('=');
		sb.append(((this.discountedValue == null) ? "<null>" : this.discountedValue));
		sb.append(',');
		sb.append("optional");
		sb.append('=');
		sb.append(((this.optional == null) ? "<null>" : this.optional));
		sb.append(',');
		sb.append("optionalChargeable");
		sb.append('=');
		sb.append(((this.optionalChargeable == null) ? "<null>" : this.optionalChargeable));
		sb.append(',');
		sb.append("taxRate");
		sb.append('=');
		sb.append(((this.taxRate == null) ? "<null>" : this.taxRate));
		sb.append(',');
		sb.append("sumNet");
		sb.append('=');
		sb.append(((this.sumNet == null) ? "<null>" : this.sumNet));
		sb.append(',');
		sb.append("sumGross");
		sb.append('=');
		sb.append(((this.sumGross == null) ? "<null>" : this.sumGross));
		sb.append(',');
		sb.append("sumTax");
		sb.append('=');
		sb.append(((this.sumTax == null) ? "<null>" : this.sumTax));
		sb.append(',');
		sb.append("sumDiscount");
		sb.append('=');
		sb.append(((this.sumDiscount == null) ? "<null>" : this.sumDiscount));
		sb.append(',');
		sb.append("sumNetForeignCurrency");
		sb.append('=');
		sb.append(((this.sumNetForeignCurrency == null) ? "<null>" : this.sumNetForeignCurrency));
		sb.append(',');
		sb.append("sumTaxForeignCurrency");
		sb.append('=');
		sb.append(((this.sumTaxForeignCurrency == null) ? "<null>" : this.sumTaxForeignCurrency));
		sb.append(',');
		sb.append("sumGrossForeignCurrency");
		sb.append('=');
		sb.append(((this.sumGrossForeignCurrency == null) ? "<null>" : this.sumGrossForeignCurrency));
		sb.append(',');
		sb.append("sumDiscountForeignCurrency");
		sb.append('=');
		sb.append(((this.sumDiscountForeignCurrency == null) ? "<null>" : this.sumDiscountForeignCurrency));
		sb.append(',');
		sb.append("createNextPart");
		sb.append('=');
		sb.append(((this.createNextPart == null) ? "<null>" : this.createNextPart));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.sumTax == null) ? 0 : this.sumTax.hashCode()));
		result = ((result * 31) + ((this.createNextPart == null) ? 0 : this.createNextPart.hashCode()));
		result = ((result * 31) + ((this.part == null) ? 0 : this.part.hashCode()));
		result = ((result * 31) + ((this.optionalChargeable == null) ? 0 : this.optionalChargeable.hashCode()));
		result = ((result * 31) + ((this.sumGross == null) ? 0 : this.sumGross.hashCode()));
		result = ((result * 31) + ((this.update == null) ? 0 : this.update.hashCode()));
		result = ((result * 31) + ((this.discount == null) ? 0 : this.discount.hashCode()));
		result = ((result * 31) + ((this.positionNumber == null) ? 0 : this.positionNumber.hashCode()));
		result = ((result * 31) + ((this.priceNet == null) ? 0 : this.priceNet.hashCode()));
		result = ((result * 31) + ((this.priceGross == null) ? 0 : this.priceGross.hashCode()));
		result = ((result * 31) + ((this.unity == null) ? 0 : this.unity.hashCode()));
		result = ((result * 31) + ((this.sumTaxForeignCurrency == null) ? 0 : this.sumTaxForeignCurrency.hashCode()));
		result = ((result * 31)
				+ ((this.sumGrossForeignCurrency == null) ? 0 : this.sumGrossForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.price == null) ? 0 : this.price.hashCode()));
		result = ((result * 31) + ((this.create == null) ? 0 : this.create.hashCode()));
		result = ((result * 31) + ((this.sumNetForeignCurrency == null) ? 0 : this.sumNetForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.text == null) ? 0 : this.text.hashCode()));
		result = ((result * 31) + ((this.isPercentage == null) ? 0 : this.isPercentage.hashCode()));
		result = ((result * 31) + ((this.order == null) ? 0 : this.order.hashCode()));
		result = ((result * 31) + ((this.additionalInformation == null) ? 0 : this.additionalInformation.hashCode()));
		result = ((result * 31) + ((this.quantity == null) ? 0 : this.quantity.hashCode()));
		result = ((result * 31) + ((this.sevClient == null) ? 0 : this.sevClient.hashCode()));
		result = ((result * 31) + ((this.optional == null) ? 0 : this.optional.hashCode()));
		result = ((result * 31)
				+ ((this.sumDiscountForeignCurrency == null) ? 0 : this.sumDiscountForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.priority == null) ? 0 : this.priority.hashCode()));
		result = ((result * 31) + ((this.taxRate == null) ? 0 : this.taxRate.hashCode()));
		result = ((result * 31) + ((this.sumNet == null) ? 0 : this.sumNet.hashCode()));
		result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
		result = ((result * 31) + ((this.discountedValue == null) ? 0 : this.discountedValue.hashCode()));
		result = ((result * 31) + ((this.objectName == null) ? 0 : this.objectName.hashCode()));
		result = ((result * 31) + ((this.priceTax == null) ? 0 : this.priceTax.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.sumDiscount == null) ? 0 : this.sumDiscount.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Position) == false) {
			return false;
		}
		Position rhs = ((Position) other);
		return (((((((((((((((((((((((((((((((((((this.sumTax == rhs.sumTax)
				|| ((this.sumTax != null) && this.sumTax.equals(rhs.sumTax)))
				&& ((this.createNextPart == rhs.createNextPart)
						|| ((this.createNextPart != null) && this.createNextPart.equals(rhs.createNextPart))))
				&& ((this.part == rhs.part) || ((this.part != null) && this.part.equals(rhs.part))))
				&& ((this.optionalChargeable == rhs.optionalChargeable) || ((this.optionalChargeable != null)
						&& this.optionalChargeable.equals(rhs.optionalChargeable))))
				&& ((this.sumGross == rhs.sumGross) || ((this.sumGross != null) && this.sumGross.equals(rhs.sumGross))))
				&& ((this.update == rhs.update) || ((this.update != null) && this.update.equals(rhs.update))))
				&& ((this.discount == rhs.discount) || ((this.discount != null) && this.discount.equals(rhs.discount))))
				&& ((this.positionNumber == rhs.positionNumber)
						|| ((this.positionNumber != null) && this.positionNumber.equals(rhs.positionNumber))))
				&& ((this.priceNet == rhs.priceNet) || ((this.priceNet != null) && this.priceNet.equals(rhs.priceNet))))
				&& ((this.priceGross == rhs.priceGross)
						|| ((this.priceGross != null) && this.priceGross.equals(rhs.priceGross))))
				&& ((this.unity == rhs.unity) || ((this.unity != null) && this.unity.equals(rhs.unity))))
				&& ((this.sumTaxForeignCurrency == rhs.sumTaxForeignCurrency) || ((this.sumTaxForeignCurrency != null)
						&& this.sumTaxForeignCurrency.equals(rhs.sumTaxForeignCurrency))))
				&& ((this.sumGrossForeignCurrency == rhs.sumGrossForeignCurrency)
						|| ((this.sumGrossForeignCurrency != null)
								&& this.sumGrossForeignCurrency.equals(rhs.sumGrossForeignCurrency))))
				&& ((this.price == rhs.price) || ((this.price != null) && this.price.equals(rhs.price))))
				&& ((this.create == rhs.create) || ((this.create != null) && this.create.equals(rhs.create))))
				&& ((this.sumNetForeignCurrency == rhs.sumNetForeignCurrency) || ((this.sumNetForeignCurrency != null)
						&& this.sumNetForeignCurrency.equals(rhs.sumNetForeignCurrency))))
				&& ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
				&& ((this.text == rhs.text) || ((this.text != null) && this.text.equals(rhs.text))))
				&& ((this.isPercentage == rhs.isPercentage)
						|| ((this.isPercentage != null) && this.isPercentage.equals(rhs.isPercentage))))
				&& ((this.order == rhs.order) || ((this.order != null) && this.order.equals(rhs.order))))
				&& ((this.additionalInformation == rhs.additionalInformation) || ((this.additionalInformation != null)
						&& this.additionalInformation.equals(rhs.additionalInformation))))
				&& ((this.quantity == rhs.quantity) || ((this.quantity != null) && this.quantity.equals(rhs.quantity))))
				&& ((this.sevClient == rhs.sevClient)
						|| ((this.sevClient != null) && this.sevClient.equals(rhs.sevClient))))
				&& ((this.optional == rhs.optional) || ((this.optional != null) && this.optional.equals(rhs.optional))))
				&& ((this.sumDiscountForeignCurrency == rhs.sumDiscountForeignCurrency)
						|| ((this.sumDiscountForeignCurrency != null)
								&& this.sumDiscountForeignCurrency.equals(rhs.sumDiscountForeignCurrency))))
				&& ((this.priority == rhs.priority) || ((this.priority != null) && this.priority.equals(rhs.priority))))
				&& ((this.taxRate == rhs.taxRate) || ((this.taxRate != null) && this.taxRate.equals(rhs.taxRate))))
				&& ((this.sumNet == rhs.sumNet) || ((this.sumNet != null) && this.sumNet.equals(rhs.sumNet))))
				&& ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
				&& ((this.discountedValue == rhs.discountedValue)
						|| ((this.discountedValue != null) && this.discountedValue.equals(rhs.discountedValue))))
				&& ((this.objectName == rhs.objectName)
						|| ((this.objectName != null) && this.objectName.equals(rhs.objectName))))
				&& ((this.priceTax == rhs.priceTax) || ((this.priceTax != null) && this.priceTax.equals(rhs.priceTax))))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))))
				&& ((this.sumDiscount == rhs.sumDiscount)
						|| ((this.sumDiscount != null) && this.sumDiscount.equals(rhs.sumDiscount))));
	}

}
