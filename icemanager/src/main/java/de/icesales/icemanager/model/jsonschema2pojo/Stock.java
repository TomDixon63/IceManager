package de.icesales.icemanager.model.jsonschema2pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

//{"w2BCount":9991,"w5BCount":57612,"w15BCount":220,"wlCount":23,"c2BCount":331,"c5BCount":61,"c15BCount":"6666","clCount":"333","lastupdate":12032024}

public class Stock implements Serializable {

	@JsonProperty("w2BCount")
	private int w2BCount;

	@JsonProperty("w5BCount")
	private int w5BCount;

	@JsonProperty("w15BCount")
	private int w15BCount;

	@JsonProperty("wlCount")
	private int wlCount;

	@JsonProperty("c2BCount")
	private int c2BCount;

	@JsonProperty("c5BCount")
	private int c5BCount;

	@JsonProperty("c15BCount")
	private int c15BCount;

	@JsonProperty("clCount")
	private int clCount;

	// int because of mapping problems if string
	@JsonProperty("lastupdate")
	private String lastupdate;

	public Stock() {

	}

	public Stock(int w2bCount, int w5bCount, int w15bCount, int wlCount, int c2bCount, int c5bCount, int c15bCount,
			int clCount, String lastupdate) {
		super();
		w2BCount = w2bCount;
		w5BCount = w5bCount;
		w15BCount = w15bCount;
		this.wlCount = wlCount;
		c2BCount = c2bCount;
		c5BCount = c5bCount;
		c15BCount = c15bCount;
		this.clCount = clCount;
		this.lastupdate = lastupdate;
	}

	public int getW2BCount() {
		return w2BCount;
	}

	public void setW2BCount(int w2bCount) {
		w2BCount = w2bCount;
	}

	public int getW5BCount() {
		return w5BCount;
	}

	public void setW5BCount(int w5bCount) {
		w5BCount = w5bCount;
	}

	public int getW15BCount() {
		return w15BCount;
	}

	public void setW15BCount(int w15bCount) {
		w15BCount = w15bCount;
	}

	public int getWlCount() {
		return wlCount;
	}

	public void setWlCount(int wlCount) {
		this.wlCount = wlCount;
	}

	public int getC2BCount() {
		return c2BCount;
	}

	public void setC2BCount(int c2bCount) {
		c2BCount = c2bCount;
	}

	public int getC5BCount() {
		return c5BCount;
	}

	public void setC5BCount(int c5bCount) {
		c5BCount = c5bCount;
	}

	public int getC15BCount() {
		return c15BCount;
	}

	public void setC15BCount(int c15bCount) {
		c15BCount = c15bCount;
	}

	public int getClCount() {
		return clCount;
	}

	public void setClCount(int clCount) {
		this.clCount = clCount;
	}

	public String getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

}
