
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "objectName" })
@jakarta.annotation.Generated("jsonschema2pojo")
public class Part implements Serializable {

	@JsonProperty("id")
	private String id;
	@JsonProperty("objectName")
	private String objectName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	private final static long serialVersionUID = -6679712957695628731L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Part() {
	}

	/**
	 * 
	 * @param objectName
	 * @param id
	 */
	public Part(String id, String objectName) {
		super();
		this.id = id;
		this.objectName = objectName;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public Part withId(String id) {
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

	public Part withObjectName(String objectName) {
		this.objectName = objectName;
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

	public Part withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Part.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("objectName");
		sb.append('=');
		sb.append(((this.objectName == null) ? "<null>" : this.objectName));
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
		result = ((result * 31) + ((this.objectName == null) ? 0 : this.objectName.hashCode()));
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Part) == false) {
			return false;
		}
		Part rhs = ((Part) other);
		return ((((this.objectName == rhs.objectName)
				|| ((this.objectName != null) && this.objectName.equals(rhs.objectName)))
				&& ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))));
	}

}
