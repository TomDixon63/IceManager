
package de.icesales.icemanager.model.jsonschema2pojo;

/**
 * Represents the "Order" Object.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "objectName", "additionalInformation", "create", "update", "orderNumber", "contact",
		"orderDate", "status", "header", "headText", "footText", "addressName", "addressStreet", "addressZip",
		"addressCity", "addressCountry", "createUser", "sevClient", "deliveryTerms", "paymentTerms", "origin",
		"version", "smallSettlement", "contactPerson", "taxRate", "taxText", "addressParentName", "taxType",
		"orderType", "sendDate", "addressParentName2", "addressName2", "addressGender", "address", "currency", "sumNet",
		"sumTax", "sumGross", "sumDiscounts", "sumNetForeignCurrency", "sumTaxForeignCurrency",
		"sumGrossForeignCurrency", "sumDiscountsForeignCurrency", "weight", "customerInternalNote", "showNet",
		"sendType", "sumDiscountNet", "sumDiscountGross", "sumDiscountNetForeignCurrency",
		"sumDiscountGrossForeignCurrency", "positions" })
@Generated("jsonschema2pojo")
public class Icemanager implements Serializable {

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
	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("contact")
	private Contact contact;
	@JsonProperty("orderDate")
	private String orderDate;
	@JsonProperty("status")
	private String status;
	@JsonProperty("header")
	private String header;
	@JsonProperty("headText")
	private String headText;
	@JsonProperty("footText")
	private String footText;
	@JsonProperty("addressName")
	private String addressName;
	@JsonProperty("addressStreet")
	private Object addressStreet;
	@JsonProperty("addressZip")
	private Object addressZip;
	@JsonProperty("addressCity")
	private Object addressCity;
	@JsonProperty("addressCountry")
	private AddressCountry addressCountry;
	@JsonProperty("createUser")
	private CreateUser createUser;
	@JsonProperty("sevClient")
	private SevClient sevClient;
	@JsonProperty("deliveryTerms")
	private String deliveryTerms;
	@JsonProperty("paymentTerms")
	private Object paymentTerms;
	@JsonProperty("origin")
	private Origin origin;
	@JsonProperty("version")
	private String version;
	@JsonProperty("smallSettlement")
	private String smallSettlement;
	@JsonProperty("contactPerson")
	private ContactPerson contactPerson;
	@JsonProperty("taxRate")
	private String taxRate;
	@JsonProperty("taxText")
	private String taxText;
	@JsonProperty("addressParentName")
	private Object addressParentName;
	@JsonProperty("taxType")
	private String taxType;
	@JsonProperty("orderType")
	private String orderType;
	@JsonProperty("sendDate")
	private String sendDate;
	@JsonProperty("addressParentName2")
	private Object addressParentName2;
	@JsonProperty("addressName2")
	private Object addressName2;
	@JsonProperty("addressGender")
	private Object addressGender;
	@JsonProperty("address")
	private String address;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("sumNet")
	private String sumNet;
	@JsonProperty("sumTax")
	private String sumTax;
	@JsonProperty("sumGross")
	private String sumGross;
	@JsonProperty("sumDiscounts")
	private String sumDiscounts;
	@JsonProperty("sumNetForeignCurrency")
	private String sumNetForeignCurrency;
	@JsonProperty("sumTaxForeignCurrency")
	private String sumTaxForeignCurrency;
	@JsonProperty("sumGrossForeignCurrency")
	private String sumGrossForeignCurrency;
	@JsonProperty("sumDiscountsForeignCurrency")
	private String sumDiscountsForeignCurrency;
	@JsonProperty("weight")
	private String weight;
	@JsonProperty("customerInternalNote")
	private Object customerInternalNote;
	@JsonProperty("showNet")
	private String showNet;
	@JsonProperty("sendType")
	private String sendType;
	@JsonProperty("sumDiscountNet")
	private String sumDiscountNet;
	@JsonProperty("sumDiscountGross")
	private String sumDiscountGross;
	@JsonProperty("sumDiscountNetForeignCurrency")
	private String sumDiscountNetForeignCurrency;
	@JsonProperty("sumDiscountGrossForeignCurrency")
	private String sumDiscountGrossForeignCurrency;
	@JsonProperty("positions")
	private List<Position> positions = new ArrayList<Position>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	private final static long serialVersionUID = -1603812636064383462L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Icemanager() {
	}

	/**
	 * 
	 * @param sumTax
	 * @param orderType
	 * @param orderNumber
	 * @param sendDate
	 * @param addressParentName2
	 * @param contact
	 * @param sumDiscounts
	 * @param create
	 * @param sumNetForeignCurrency
	 * @param id
	 * @param paymentTerms
	 * @param taxType
	 * @param addressCity
	 * @param addressCountry
	 * @param additionalInformation
	 * @param weight
	 * @param positions
	 * @param addressParentName
	 * @param version
	 * @param taxRate
	 * @param sumNet
	 * @param customerInternalNote
	 * @param sendType
	 * @param header
	 * @param addressName2
	 * @param orderDate
	 * @param sumDiscountsForeignCurrency
	 * @param status
	 * @param footText
	 * @param origin
	 * @param addressGender
	 * @param sumGross
	 * @param sumDiscountNet
	 * @param update
	 * @param contactPerson
	 * @param sumTaxForeignCurrency
	 * @param headText
	 * @param sumGrossForeignCurrency
	 * @param showNet
	 * @param smallSettlement
	 * @param currency
	 * @param deliveryTerms
	 * @param addressZip
	 * @param taxText
	 * @param address
	 * @param sevClient
	 * @param sumDiscountGross
	 * @param sumDiscountGrossForeignCurrency
	 * @param addressStreet
	 * @param objectName
	 * @param addressName
	 * @param createUser
	 * @param sumDiscountNetForeignCurrency
	 */
	public Icemanager(String id, String objectName, Object additionalInformation, String create, String update,
			String orderNumber, Contact contact, String orderDate, String status, String header, String headText,
			String footText, String addressName, Object addressStreet, Object addressZip, Object addressCity,
			AddressCountry addressCountry, CreateUser createUser, SevClient sevClient, String deliveryTerms,
			Object paymentTerms, Origin origin, String version, String smallSettlement, ContactPerson contactPerson,
			String taxRate, String taxText, Object addressParentName, String taxType, String orderType, String sendDate,
			Object addressParentName2, Object addressName2, Object addressGender, String address, String currency,
			String sumNet, String sumTax, String sumGross, String sumDiscounts, String sumNetForeignCurrency,
			String sumTaxForeignCurrency, String sumGrossForeignCurrency, String sumDiscountsForeignCurrency,
			String weight, Object customerInternalNote, String showNet, String sendType, String sumDiscountNet,
			String sumDiscountGross, String sumDiscountNetForeignCurrency, String sumDiscountGrossForeignCurrency,
			List<Position> positions) {
		super();
		this.id = id;
		this.objectName = objectName;
		this.additionalInformation = additionalInformation;
		this.create = create;
		this.update = update;
		this.orderNumber = orderNumber;
		this.contact = contact;
		this.orderDate = orderDate;
		this.status = status;
		this.header = header;
		this.headText = headText;
		this.footText = footText;
		this.addressName = addressName;
		this.addressStreet = addressStreet;
		this.addressZip = addressZip;
		this.addressCity = addressCity;
		this.addressCountry = addressCountry;
		this.createUser = createUser;
		this.sevClient = sevClient;
		this.deliveryTerms = deliveryTerms;
		this.paymentTerms = paymentTerms;
		this.origin = origin;
		this.version = version;
		this.smallSettlement = smallSettlement;
		this.contactPerson = contactPerson;
		this.taxRate = taxRate;
		this.taxText = taxText;
		this.addressParentName = addressParentName;
		this.taxType = taxType;
		this.orderType = orderType;
		this.sendDate = sendDate;
		this.addressParentName2 = addressParentName2;
		this.addressName2 = addressName2;
		this.addressGender = addressGender;
		this.address = address;
		this.currency = currency;
		this.sumNet = sumNet;
		this.sumTax = sumTax;
		this.sumGross = sumGross;
		this.sumDiscounts = sumDiscounts;
		this.sumNetForeignCurrency = sumNetForeignCurrency;
		this.sumTaxForeignCurrency = sumTaxForeignCurrency;
		this.sumGrossForeignCurrency = sumGrossForeignCurrency;
		this.sumDiscountsForeignCurrency = sumDiscountsForeignCurrency;
		this.weight = weight;
		this.customerInternalNote = customerInternalNote;
		this.showNet = showNet;
		this.sendType = sendType;
		this.sumDiscountNet = sumDiscountNet;
		this.sumDiscountGross = sumDiscountGross;
		this.sumDiscountNetForeignCurrency = sumDiscountNetForeignCurrency;
		this.sumDiscountGrossForeignCurrency = sumDiscountGrossForeignCurrency;
		this.positions = positions;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public Icemanager withId(String id) {
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

	public Icemanager withObjectName(String objectName) {
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

	public Icemanager withAdditionalInformation(Object additionalInformation) {
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

	public Icemanager withCreate(String create) {
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

	public Icemanager withUpdate(String update) {
		this.update = update;
		return this;
	}

	@JsonProperty("orderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("orderNumber")
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Icemanager withOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	@JsonProperty("contact")
	public Contact getContact() {
		return contact;
	}

	@JsonProperty("contact")
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Icemanager withContact(Contact contact) {
		this.contact = contact;
		return this;
	}

	@JsonProperty("orderDate")
	public String getOrderDate() {
		return orderDate;
	}

	@JsonProperty("orderDate")
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Icemanager withOrderDate(String orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	public Icemanager withStatus(String status) {
		this.status = status;
		return this;
	}

	@JsonProperty("header")
	public String getHeader() {
		return header;
	}

	@JsonProperty("header")
	public void setHeader(String header) {
		this.header = header;
	}

	public Icemanager withHeader(String header) {
		this.header = header;
		return this;
	}

	@JsonProperty("headText")
	public String getHeadText() {
		return headText;
	}

	@JsonProperty("headText")
	public void setHeadText(String headText) {
		this.headText = headText;
	}

	public Icemanager withHeadText(String headText) {
		this.headText = headText;
		return this;
	}

	@JsonProperty("footText")
	public String getFootText() {
		return footText;
	}

	@JsonProperty("footText")
	public void setFootText(String footText) {
		this.footText = footText;
	}

	public Icemanager withFootText(String footText) {
		this.footText = footText;
		return this;
	}

	@JsonProperty("addressName")
	public String getAddressName() {
		return addressName;
	}

	@JsonProperty("addressName")
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public Icemanager withAddressName(String addressName) {
		this.addressName = addressName;
		return this;
	}

	@JsonProperty("addressStreet")
	public Object getAddressStreet() {
		return addressStreet;
	}

	@JsonProperty("addressStreet")
	public void setAddressStreet(Object addressStreet) {
		this.addressStreet = addressStreet;
	}

	public Icemanager withAddressStreet(Object addressStreet) {
		this.addressStreet = addressStreet;
		return this;
	}

	@JsonProperty("addressZip")
	public Object getAddressZip() {
		return addressZip;
	}

	@JsonProperty("addressZip")
	public void setAddressZip(Object addressZip) {
		this.addressZip = addressZip;
	}

	public Icemanager withAddressZip(Object addressZip) {
		this.addressZip = addressZip;
		return this;
	}

	@JsonProperty("addressCity")
	public Object getAddressCity() {
		return addressCity;
	}

	@JsonProperty("addressCity")
	public void setAddressCity(Object addressCity) {
		this.addressCity = addressCity;
	}

	public Icemanager withAddressCity(Object addressCity) {
		this.addressCity = addressCity;
		return this;
	}

	@JsonProperty("addressCountry")
	public AddressCountry getAddressCountry() {
		return addressCountry;
	}

	@JsonProperty("addressCountry")
	public void setAddressCountry(AddressCountry addressCountry) {
		this.addressCountry = addressCountry;
	}

	public Icemanager withAddressCountry(AddressCountry addressCountry) {
		this.addressCountry = addressCountry;
		return this;
	}

	@JsonProperty("createUser")
	public CreateUser getCreateUser() {
		return createUser;
	}

	@JsonProperty("createUser")
	public void setCreateUser(CreateUser createUser) {
		this.createUser = createUser;
	}

	public Icemanager withCreateUser(CreateUser createUser) {
		this.createUser = createUser;
		return this;
	}

	@JsonProperty("sevClient")
	public SevClient getSevClient() {
		return sevClient;
	}

	@JsonProperty("sevClient")
	public void setSevClient(SevClient sevClient) {
		this.sevClient = sevClient;
	}

	public Icemanager withSevClient(SevClient sevClient) {
		this.sevClient = sevClient;
		return this;
	}

	@JsonProperty("deliveryTerms")
	public String getDeliveryTerms() {
		return deliveryTerms;
	}

	@JsonProperty("deliveryTerms")
	public void setDeliveryTerms(String deliveryTerms) {
		this.deliveryTerms = deliveryTerms;
	}

	public Icemanager withDeliveryTerms(String deliveryTerms) {
		this.deliveryTerms = deliveryTerms;
		return this;
	}

	@JsonProperty("paymentTerms")
	public Object getPaymentTerms() {
		return paymentTerms;
	}

	@JsonProperty("paymentTerms")
	public void setPaymentTerms(Object paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public Icemanager withPaymentTerms(Object paymentTerms) {
		this.paymentTerms = paymentTerms;
		return this;
	}

	@JsonProperty("origin")
	public Origin getOrigin() {
		return origin;
	}

	@JsonProperty("origin")
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public Icemanager withOrigin(Origin origin) {
		this.origin = origin;
		return this;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	public Icemanager withVersion(String version) {
		this.version = version;
		return this;
	}

	@JsonProperty("smallSettlement")
	public String getSmallSettlement() {
		return smallSettlement;
	}

	@JsonProperty("smallSettlement")
	public void setSmallSettlement(String smallSettlement) {
		this.smallSettlement = smallSettlement;
	}

	public Icemanager withSmallSettlement(String smallSettlement) {
		this.smallSettlement = smallSettlement;
		return this;
	}

	@JsonProperty("contactPerson")
	public ContactPerson getContactPerson() {
		return contactPerson;
	}

	@JsonProperty("contactPerson")
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Icemanager withContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
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

	public Icemanager withTaxRate(String taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	@JsonProperty("taxText")
	public String getTaxText() {
		return taxText;
	}

	@JsonProperty("taxText")
	public void setTaxText(String taxText) {
		this.taxText = taxText;
	}

	public Icemanager withTaxText(String taxText) {
		this.taxText = taxText;
		return this;
	}

	@JsonProperty("addressParentName")
	public Object getAddressParentName() {
		return addressParentName;
	}

	@JsonProperty("addressParentName")
	public void setAddressParentName(Object addressParentName) {
		this.addressParentName = addressParentName;
	}

	public Icemanager withAddressParentName(Object addressParentName) {
		this.addressParentName = addressParentName;
		return this;
	}

	@JsonProperty("taxType")
	public String getTaxType() {
		return taxType;
	}

	@JsonProperty("taxType")
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public Icemanager withTaxType(String taxType) {
		this.taxType = taxType;
		return this;
	}

	@JsonProperty("orderType")
	public String getOrderType() {
		return orderType;
	}

	@JsonProperty("orderType")
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Icemanager withOrderType(String orderType) {
		this.orderType = orderType;
		return this;
	}

	@JsonProperty("sendDate")
	public String getSendDate() {
		return sendDate;
	}

	@JsonProperty("sendDate")
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public Icemanager withSendDate(String sendDate) {
		this.sendDate = sendDate;
		return this;
	}

	@JsonProperty("addressParentName2")
	public Object getAddressParentName2() {
		return addressParentName2;
	}

	@JsonProperty("addressParentName2")
	public void setAddressParentName2(Object addressParentName2) {
		this.addressParentName2 = addressParentName2;
	}

	public Icemanager withAddressParentName2(Object addressParentName2) {
		this.addressParentName2 = addressParentName2;
		return this;
	}

	@JsonProperty("addressName2")
	public Object getAddressName2() {
		return addressName2;
	}

	@JsonProperty("addressName2")
	public void setAddressName2(Object addressName2) {
		this.addressName2 = addressName2;
	}

	public Icemanager withAddressName2(Object addressName2) {
		this.addressName2 = addressName2;
		return this;
	}

	@JsonProperty("addressGender")
	public Object getAddressGender() {
		return addressGender;
	}

	@JsonProperty("addressGender")
	public void setAddressGender(Object addressGender) {
		this.addressGender = addressGender;
	}

	public Icemanager withAddressGender(Object addressGender) {
		this.addressGender = addressGender;
		return this;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	public Icemanager withAddress(String address) {
		this.address = address;
		return this;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Icemanager withCurrency(String currency) {
		this.currency = currency;
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

	public Icemanager withSumNet(String sumNet) {
		this.sumNet = sumNet;
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

	public Icemanager withSumTax(String sumTax) {
		this.sumTax = sumTax;
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

	public Icemanager withSumGross(String sumGross) {
		this.sumGross = sumGross;
		return this;
	}

	@JsonProperty("sumDiscounts")
	public String getSumDiscounts() {
		return sumDiscounts;
	}

	@JsonProperty("sumDiscounts")
	public void setSumDiscounts(String sumDiscounts) {
		this.sumDiscounts = sumDiscounts;
	}

	public Icemanager withSumDiscounts(String sumDiscounts) {
		this.sumDiscounts = sumDiscounts;
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

	public Icemanager withSumNetForeignCurrency(String sumNetForeignCurrency) {
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

	public Icemanager withSumTaxForeignCurrency(String sumTaxForeignCurrency) {
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

	public Icemanager withSumGrossForeignCurrency(String sumGrossForeignCurrency) {
		this.sumGrossForeignCurrency = sumGrossForeignCurrency;
		return this;
	}

	@JsonProperty("sumDiscountsForeignCurrency")
	public String getSumDiscountsForeignCurrency() {
		return sumDiscountsForeignCurrency;
	}

	@JsonProperty("sumDiscountsForeignCurrency")
	public void setSumDiscountsForeignCurrency(String sumDiscountsForeignCurrency) {
		this.sumDiscountsForeignCurrency = sumDiscountsForeignCurrency;
	}

	public Icemanager withSumDiscountsForeignCurrency(String sumDiscountsForeignCurrency) {
		this.sumDiscountsForeignCurrency = sumDiscountsForeignCurrency;
		return this;
	}

	@JsonProperty("weight")
	public String getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Icemanager withWeight(String weight) {
		this.weight = weight;
		return this;
	}

	@JsonProperty("customerInternalNote")
	public Object getCustomerInternalNote() {
		return customerInternalNote;
	}

	@JsonProperty("customerInternalNote")
	public void setCustomerInternalNote(Object customerInternalNote) {
		this.customerInternalNote = customerInternalNote;
	}

	public Icemanager withCustomerInternalNote(Object customerInternalNote) {
		this.customerInternalNote = customerInternalNote;
		return this;
	}

	@JsonProperty("showNet")
	public String getShowNet() {
		return showNet;
	}

	@JsonProperty("showNet")
	public void setShowNet(String showNet) {
		this.showNet = showNet;
	}

	public Icemanager withShowNet(String showNet) {
		this.showNet = showNet;
		return this;
	}

	@JsonProperty("sendType")
	public String getSendType() {
		return sendType;
	}

	@JsonProperty("sendType")
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public Icemanager withSendType(String sendType) {
		this.sendType = sendType;
		return this;
	}

	@JsonProperty("sumDiscountNet")
	public String getSumDiscountNet() {
		return sumDiscountNet;
	}

	@JsonProperty("sumDiscountNet")
	public void setSumDiscountNet(String sumDiscountNet) {
		this.sumDiscountNet = sumDiscountNet;
	}

	public Icemanager withSumDiscountNet(String sumDiscountNet) {
		this.sumDiscountNet = sumDiscountNet;
		return this;
	}

	@JsonProperty("sumDiscountGross")
	public String getSumDiscountGross() {
		return sumDiscountGross;
	}

	@JsonProperty("sumDiscountGross")
	public void setSumDiscountGross(String sumDiscountGross) {
		this.sumDiscountGross = sumDiscountGross;
	}

	public Icemanager withSumDiscountGross(String sumDiscountGross) {
		this.sumDiscountGross = sumDiscountGross;
		return this;
	}

	@JsonProperty("sumDiscountNetForeignCurrency")
	public String getSumDiscountNetForeignCurrency() {
		return sumDiscountNetForeignCurrency;
	}

	@JsonProperty("sumDiscountNetForeignCurrency")
	public void setSumDiscountNetForeignCurrency(String sumDiscountNetForeignCurrency) {
		this.sumDiscountNetForeignCurrency = sumDiscountNetForeignCurrency;
	}

	public Icemanager withSumDiscountNetForeignCurrency(String sumDiscountNetForeignCurrency) {
		this.sumDiscountNetForeignCurrency = sumDiscountNetForeignCurrency;
		return this;
	}

	@JsonProperty("sumDiscountGrossForeignCurrency")
	public String getSumDiscountGrossForeignCurrency() {
		return sumDiscountGrossForeignCurrency;
	}

	@JsonProperty("sumDiscountGrossForeignCurrency")
	public void setSumDiscountGrossForeignCurrency(String sumDiscountGrossForeignCurrency) {
		this.sumDiscountGrossForeignCurrency = sumDiscountGrossForeignCurrency;
	}

	public Icemanager withSumDiscountGrossForeignCurrency(String sumDiscountGrossForeignCurrency) {
		this.sumDiscountGrossForeignCurrency = sumDiscountGrossForeignCurrency;
		return this;
	}

	@JsonProperty("positions")
	public List<Position> getPositions() {
		return positions;
	}

	@JsonProperty("positions")
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	public Icemanager withPositions(List<Position> positions) {
		this.positions = positions;
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

	public Icemanager withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Icemanager.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
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
		sb.append("orderNumber");
		sb.append('=');
		sb.append(((this.orderNumber == null) ? "<null>" : this.orderNumber));
		sb.append(',');
		sb.append("contact");
		sb.append('=');
		sb.append(((this.contact == null) ? "<null>" : this.contact));
		sb.append(',');
		sb.append("orderDate");
		sb.append('=');
		sb.append(((this.orderDate == null) ? "<null>" : this.orderDate));
		sb.append(',');
		sb.append("status");
		sb.append('=');
		sb.append(((this.status == null) ? "<null>" : this.status));
		sb.append(',');
		sb.append("header");
		sb.append('=');
		sb.append(((this.header == null) ? "<null>" : this.header));
		sb.append(',');
		sb.append("headText");
		sb.append('=');
		sb.append(((this.headText == null) ? "<null>" : this.headText));
		sb.append(',');
		sb.append("footText");
		sb.append('=');
		sb.append(((this.footText == null) ? "<null>" : this.footText));
		sb.append(',');
		sb.append("addressName");
		sb.append('=');
		sb.append(((this.addressName == null) ? "<null>" : this.addressName));
		sb.append(',');
		sb.append("addressStreet");
		sb.append('=');
		sb.append(((this.addressStreet == null) ? "<null>" : this.addressStreet));
		sb.append(',');
		sb.append("addressZip");
		sb.append('=');
		sb.append(((this.addressZip == null) ? "<null>" : this.addressZip));
		sb.append(',');
		sb.append("addressCity");
		sb.append('=');
		sb.append(((this.addressCity == null) ? "<null>" : this.addressCity));
		sb.append(',');
		sb.append("addressCountry");
		sb.append('=');
		sb.append(((this.addressCountry == null) ? "<null>" : this.addressCountry));
		sb.append(',');
		sb.append("createUser");
		sb.append('=');
		sb.append(((this.createUser == null) ? "<null>" : this.createUser));
		sb.append(',');
		sb.append("sevClient");
		sb.append('=');
		sb.append(((this.sevClient == null) ? "<null>" : this.sevClient));
		sb.append(',');
		sb.append("deliveryTerms");
		sb.append('=');
		sb.append(((this.deliveryTerms == null) ? "<null>" : this.deliveryTerms));
		sb.append(',');
		sb.append("paymentTerms");
		sb.append('=');
		sb.append(((this.paymentTerms == null) ? "<null>" : this.paymentTerms));
		sb.append(',');
		sb.append("origin");
		sb.append('=');
		sb.append(((this.origin == null) ? "<null>" : this.origin));
		sb.append(',');
		sb.append("version");
		sb.append('=');
		sb.append(((this.version == null) ? "<null>" : this.version));
		sb.append(',');
		sb.append("smallSettlement");
		sb.append('=');
		sb.append(((this.smallSettlement == null) ? "<null>" : this.smallSettlement));
		sb.append(',');
		sb.append("contactPerson");
		sb.append('=');
		sb.append(((this.contactPerson == null) ? "<null>" : this.contactPerson));
		sb.append(',');
		sb.append("taxRate");
		sb.append('=');
		sb.append(((this.taxRate == null) ? "<null>" : this.taxRate));
		sb.append(',');
		sb.append("taxText");
		sb.append('=');
		sb.append(((this.taxText == null) ? "<null>" : this.taxText));
		sb.append(',');
		sb.append("addressParentName");
		sb.append('=');
		sb.append(((this.addressParentName == null) ? "<null>" : this.addressParentName));
		sb.append(',');
		sb.append("taxType");
		sb.append('=');
		sb.append(((this.taxType == null) ? "<null>" : this.taxType));
		sb.append(',');
		sb.append("orderType");
		sb.append('=');
		sb.append(((this.orderType == null) ? "<null>" : this.orderType));
		sb.append(',');
		sb.append("sendDate");
		sb.append('=');
		sb.append(((this.sendDate == null) ? "<null>" : this.sendDate));
		sb.append(',');
		sb.append("addressParentName2");
		sb.append('=');
		sb.append(((this.addressParentName2 == null) ? "<null>" : this.addressParentName2));
		sb.append(',');
		sb.append("addressName2");
		sb.append('=');
		sb.append(((this.addressName2 == null) ? "<null>" : this.addressName2));
		sb.append(',');
		sb.append("addressGender");
		sb.append('=');
		sb.append(((this.addressGender == null) ? "<null>" : this.addressGender));
		sb.append(',');
		sb.append("address");
		sb.append('=');
		sb.append(((this.address == null) ? "<null>" : this.address));
		sb.append(',');
		sb.append("currency");
		sb.append('=');
		sb.append(((this.currency == null) ? "<null>" : this.currency));
		sb.append(',');
		sb.append("sumNet");
		sb.append('=');
		sb.append(((this.sumNet == null) ? "<null>" : this.sumNet));
		sb.append(',');
		sb.append("sumTax");
		sb.append('=');
		sb.append(((this.sumTax == null) ? "<null>" : this.sumTax));
		sb.append(',');
		sb.append("sumGross");
		sb.append('=');
		sb.append(((this.sumGross == null) ? "<null>" : this.sumGross));
		sb.append(',');
		sb.append("sumDiscounts");
		sb.append('=');
		sb.append(((this.sumDiscounts == null) ? "<null>" : this.sumDiscounts));
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
		sb.append("sumDiscountsForeignCurrency");
		sb.append('=');
		sb.append(((this.sumDiscountsForeignCurrency == null) ? "<null>" : this.sumDiscountsForeignCurrency));
		sb.append(',');
		sb.append("weight");
		sb.append('=');
		sb.append(((this.weight == null) ? "<null>" : this.weight));
		sb.append(',');
		sb.append("customerInternalNote");
		sb.append('=');
		sb.append(((this.customerInternalNote == null) ? "<null>" : this.customerInternalNote));
		sb.append(',');
		sb.append("showNet");
		sb.append('=');
		sb.append(((this.showNet == null) ? "<null>" : this.showNet));
		sb.append(',');
		sb.append("sendType");
		sb.append('=');
		sb.append(((this.sendType == null) ? "<null>" : this.sendType));
		sb.append(',');
		sb.append("sumDiscountNet");
		sb.append('=');
		sb.append(((this.sumDiscountNet == null) ? "<null>" : this.sumDiscountNet));
		sb.append(',');
		sb.append("sumDiscountGross");
		sb.append('=');
		sb.append(((this.sumDiscountGross == null) ? "<null>" : this.sumDiscountGross));
		sb.append(',');
		sb.append("sumDiscountNetForeignCurrency");
		sb.append('=');
		sb.append(((this.sumDiscountNetForeignCurrency == null) ? "<null>" : this.sumDiscountNetForeignCurrency));
		sb.append(',');
		sb.append("sumDiscountGrossForeignCurrency");
		sb.append('=');
		sb.append(((this.sumDiscountGrossForeignCurrency == null) ? "<null>" : this.sumDiscountGrossForeignCurrency));
		sb.append(',');
		sb.append("positions");
		sb.append('=');
		sb.append(((this.positions == null) ? "<null>" : this.positions));
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
		result = ((result * 31) + ((this.orderType == null) ? 0 : this.orderType.hashCode()));
		result = ((result * 31) + ((this.orderNumber == null) ? 0 : this.orderNumber.hashCode()));
		result = ((result * 31) + ((this.sendDate == null) ? 0 : this.sendDate.hashCode()));
		result = ((result * 31) + ((this.addressParentName2 == null) ? 0 : this.addressParentName2.hashCode()));
		result = ((result * 31) + ((this.contact == null) ? 0 : this.contact.hashCode()));
		result = ((result * 31) + ((this.sumDiscounts == null) ? 0 : this.sumDiscounts.hashCode()));
		result = ((result * 31) + ((this.create == null) ? 0 : this.create.hashCode()));
		result = ((result * 31) + ((this.sumNetForeignCurrency == null) ? 0 : this.sumNetForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.paymentTerms == null) ? 0 : this.paymentTerms.hashCode()));
		result = ((result * 31) + ((this.taxType == null) ? 0 : this.taxType.hashCode()));
		result = ((result * 31) + ((this.addressCity == null) ? 0 : this.addressCity.hashCode()));
		result = ((result * 31) + ((this.addressCountry == null) ? 0 : this.addressCountry.hashCode()));
		result = ((result * 31) + ((this.additionalInformation == null) ? 0 : this.additionalInformation.hashCode()));
		result = ((result * 31) + ((this.weight == null) ? 0 : this.weight.hashCode()));
		result = ((result * 31) + ((this.positions == null) ? 0 : this.positions.hashCode()));
		result = ((result * 31) + ((this.addressParentName == null) ? 0 : this.addressParentName.hashCode()));
		result = ((result * 31) + ((this.version == null) ? 0 : this.version.hashCode()));
		result = ((result * 31) + ((this.taxRate == null) ? 0 : this.taxRate.hashCode()));
		result = ((result * 31) + ((this.sumNet == null) ? 0 : this.sumNet.hashCode()));
		result = ((result * 31) + ((this.customerInternalNote == null) ? 0 : this.customerInternalNote.hashCode()));
		result = ((result * 31) + ((this.sendType == null) ? 0 : this.sendType.hashCode()));
		result = ((result * 31) + ((this.header == null) ? 0 : this.header.hashCode()));
		result = ((result * 31) + ((this.addressName2 == null) ? 0 : this.addressName2.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.orderDate == null) ? 0 : this.orderDate.hashCode()));
		result = ((result * 31)
				+ ((this.sumDiscountsForeignCurrency == null) ? 0 : this.sumDiscountsForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.status == null) ? 0 : this.status.hashCode()));
		result = ((result * 31) + ((this.footText == null) ? 0 : this.footText.hashCode()));
		result = ((result * 31) + ((this.origin == null) ? 0 : this.origin.hashCode()));
		result = ((result * 31) + ((this.addressGender == null) ? 0 : this.addressGender.hashCode()));
		result = ((result * 31) + ((this.sumGross == null) ? 0 : this.sumGross.hashCode()));
		result = ((result * 31) + ((this.sumDiscountNet == null) ? 0 : this.sumDiscountNet.hashCode()));
		result = ((result * 31) + ((this.update == null) ? 0 : this.update.hashCode()));
		result = ((result * 31) + ((this.contactPerson == null) ? 0 : this.contactPerson.hashCode()));
		result = ((result * 31) + ((this.sumTaxForeignCurrency == null) ? 0 : this.sumTaxForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.headText == null) ? 0 : this.headText.hashCode()));
		result = ((result * 31)
				+ ((this.sumGrossForeignCurrency == null) ? 0 : this.sumGrossForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.showNet == null) ? 0 : this.showNet.hashCode()));
		result = ((result * 31) + ((this.smallSettlement == null) ? 0 : this.smallSettlement.hashCode()));
		result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
		result = ((result * 31) + ((this.deliveryTerms == null) ? 0 : this.deliveryTerms.hashCode()));
		result = ((result * 31) + ((this.addressZip == null) ? 0 : this.addressZip.hashCode()));
		result = ((result * 31) + ((this.taxText == null) ? 0 : this.taxText.hashCode()));
		result = ((result * 31) + ((this.address == null) ? 0 : this.address.hashCode()));
		result = ((result * 31) + ((this.sevClient == null) ? 0 : this.sevClient.hashCode()));
		result = ((result * 31) + ((this.sumDiscountGross == null) ? 0 : this.sumDiscountGross.hashCode()));
		result = ((result * 31) + ((this.sumDiscountGrossForeignCurrency == null) ? 0
				: this.sumDiscountGrossForeignCurrency.hashCode()));
		result = ((result * 31) + ((this.addressStreet == null) ? 0 : this.addressStreet.hashCode()));
		result = ((result * 31) + ((this.objectName == null) ? 0 : this.objectName.hashCode()));
		result = ((result * 31) + ((this.addressName == null) ? 0 : this.addressName.hashCode()));
		result = ((result * 31) + ((this.createUser == null) ? 0 : this.createUser.hashCode()));
		result = ((result * 31)
				+ ((this.sumDiscountNetForeignCurrency == null) ? 0 : this.sumDiscountNetForeignCurrency.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Icemanager) == false) {
			return false;
		}
		Icemanager rhs = ((Icemanager) other);
		return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.sumTax == rhs.sumTax)
				|| ((this.sumTax != null) && this.sumTax.equals(rhs.sumTax)))
				&& ((this.orderType == rhs.orderType)
						|| ((this.orderType != null) && this.orderType.equals(rhs.orderType))))
				&& ((this.orderNumber == rhs.orderNumber)
						|| ((this.orderNumber != null) && this.orderNumber.equals(rhs.orderNumber))))
				&& ((this.sendDate == rhs.sendDate) || ((this.sendDate != null) && this.sendDate.equals(rhs.sendDate))))
				&& ((this.addressParentName2 == rhs.addressParentName2) || ((this.addressParentName2 != null)
						&& this.addressParentName2.equals(rhs.addressParentName2))))
				&& ((this.contact == rhs.contact) || ((this.contact != null) && this.contact.equals(rhs.contact))))
				&& ((this.sumDiscounts == rhs.sumDiscounts)
						|| ((this.sumDiscounts != null) && this.sumDiscounts.equals(rhs.sumDiscounts))))
				&& ((this.create == rhs.create) || ((this.create != null) && this.create.equals(rhs.create))))
				&& ((this.sumNetForeignCurrency == rhs.sumNetForeignCurrency) || ((this.sumNetForeignCurrency != null)
						&& this.sumNetForeignCurrency.equals(rhs.sumNetForeignCurrency))))
				&& ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
				&& ((this.paymentTerms == rhs.paymentTerms)
						|| ((this.paymentTerms != null) && this.paymentTerms.equals(rhs.paymentTerms))))
				&& ((this.taxType == rhs.taxType) || ((this.taxType != null) && this.taxType.equals(rhs.taxType))))
				&& ((this.addressCity == rhs.addressCity)
						|| ((this.addressCity != null) && this.addressCity.equals(rhs.addressCity))))
				&& ((this.addressCountry == rhs.addressCountry)
						|| ((this.addressCountry != null) && this.addressCountry.equals(rhs.addressCountry))))
				&& ((this.additionalInformation == rhs.additionalInformation) || ((this.additionalInformation != null)
						&& this.additionalInformation.equals(rhs.additionalInformation))))
				&& ((this.weight == rhs.weight) || ((this.weight != null) && this.weight.equals(rhs.weight))))
				&& ((this.positions == rhs.positions)
						|| ((this.positions != null) && this.positions.equals(rhs.positions))))
				&& ((this.addressParentName == rhs.addressParentName)
						|| ((this.addressParentName != null) && this.addressParentName.equals(rhs.addressParentName))))
				&& ((this.version == rhs.version) || ((this.version != null) && this.version.equals(rhs.version))))
				&& ((this.taxRate == rhs.taxRate) || ((this.taxRate != null) && this.taxRate.equals(rhs.taxRate))))
				&& ((this.sumNet == rhs.sumNet) || ((this.sumNet != null) && this.sumNet.equals(rhs.sumNet))))
				&& ((this.customerInternalNote == rhs.customerInternalNote) || ((this.customerInternalNote != null)
						&& this.customerInternalNote.equals(rhs.customerInternalNote))))
				&& ((this.sendType == rhs.sendType) || ((this.sendType != null) && this.sendType.equals(rhs.sendType))))
				&& ((this.header == rhs.header) || ((this.header != null) && this.header.equals(rhs.header))))
				&& ((this.addressName2 == rhs.addressName2)
						|| ((this.addressName2 != null) && this.addressName2.equals(rhs.addressName2))))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))))
				&& ((this.orderDate == rhs.orderDate)
						|| ((this.orderDate != null) && this.orderDate.equals(rhs.orderDate))))
				&& ((this.sumDiscountsForeignCurrency == rhs.sumDiscountsForeignCurrency)
						|| ((this.sumDiscountsForeignCurrency != null)
								&& this.sumDiscountsForeignCurrency.equals(rhs.sumDiscountsForeignCurrency))))
				&& ((this.status == rhs.status) || ((this.status != null) && this.status.equals(rhs.status))))
				&& ((this.footText == rhs.footText) || ((this.footText != null) && this.footText.equals(rhs.footText))))
				&& ((this.origin == rhs.origin) || ((this.origin != null) && this.origin.equals(rhs.origin))))
				&& ((this.addressGender == rhs.addressGender)
						|| ((this.addressGender != null) && this.addressGender.equals(rhs.addressGender))))
				&& ((this.sumGross == rhs.sumGross) || ((this.sumGross != null) && this.sumGross.equals(rhs.sumGross))))
				&& ((this.sumDiscountNet == rhs.sumDiscountNet)
						|| ((this.sumDiscountNet != null) && this.sumDiscountNet.equals(rhs.sumDiscountNet))))
				&& ((this.update == rhs.update) || ((this.update != null) && this.update.equals(rhs.update))))
				&& ((this.contactPerson == rhs.contactPerson)
						|| ((this.contactPerson != null) && this.contactPerson.equals(rhs.contactPerson))))
				&& ((this.sumTaxForeignCurrency == rhs.sumTaxForeignCurrency) || ((this.sumTaxForeignCurrency != null)
						&& this.sumTaxForeignCurrency.equals(rhs.sumTaxForeignCurrency))))
				&& ((this.headText == rhs.headText) || ((this.headText != null) && this.headText.equals(rhs.headText))))
				&& ((this.sumGrossForeignCurrency == rhs.sumGrossForeignCurrency)
						|| ((this.sumGrossForeignCurrency != null)
								&& this.sumGrossForeignCurrency.equals(rhs.sumGrossForeignCurrency))))
				&& ((this.showNet == rhs.showNet) || ((this.showNet != null) && this.showNet.equals(rhs.showNet))))
				&& ((this.smallSettlement == rhs.smallSettlement)
						|| ((this.smallSettlement != null) && this.smallSettlement.equals(rhs.smallSettlement))))
				&& ((this.currency == rhs.currency) || ((this.currency != null) && this.currency.equals(rhs.currency))))
				&& ((this.deliveryTerms == rhs.deliveryTerms)
						|| ((this.deliveryTerms != null) && this.deliveryTerms.equals(rhs.deliveryTerms))))
				&& ((this.addressZip == rhs.addressZip)
						|| ((this.addressZip != null) && this.addressZip.equals(rhs.addressZip))))
				&& ((this.taxText == rhs.taxText) || ((this.taxText != null) && this.taxText.equals(rhs.taxText))))
				&& ((this.address == rhs.address) || ((this.address != null) && this.address.equals(rhs.address))))
				&& ((this.sevClient == rhs.sevClient)
						|| ((this.sevClient != null) && this.sevClient.equals(rhs.sevClient))))
				&& ((this.sumDiscountGross == rhs.sumDiscountGross)
						|| ((this.sumDiscountGross != null) && this.sumDiscountGross.equals(rhs.sumDiscountGross))))
				&& ((this.sumDiscountGrossForeignCurrency == rhs.sumDiscountGrossForeignCurrency)
						|| ((this.sumDiscountGrossForeignCurrency != null)
								&& this.sumDiscountGrossForeignCurrency.equals(rhs.sumDiscountGrossForeignCurrency))))
				&& ((this.addressStreet == rhs.addressStreet)
						|| ((this.addressStreet != null) && this.addressStreet.equals(rhs.addressStreet))))
				&& ((this.objectName == rhs.objectName)
						|| ((this.objectName != null) && this.objectName.equals(rhs.objectName))))
				&& ((this.addressName == rhs.addressName)
						|| ((this.addressName != null) && this.addressName.equals(rhs.addressName))))
				&& ((this.createUser == rhs.createUser)
						|| ((this.createUser != null) && this.createUser.equals(rhs.createUser))))
				&& ((this.sumDiscountNetForeignCurrency == rhs.sumDiscountNetForeignCurrency)
						|| ((this.sumDiscountNetForeignCurrency != null)
								&& this.sumDiscountNetForeignCurrency.equals(rhs.sumDiscountNetForeignCurrency))));
	}

}
