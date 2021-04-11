package com.cg.spc.entities;

//Anikesh push git

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Address {

	@Column(length=15)
	private String buildingName;
	@Column(length=25)
	private String streetName;
	@Column(length=10)
	private String cityName;
	@Column(length=8)
	private String pincode;
	
	public Address() {
		super();
	}
	
	public Address(String buildingName, String streetName, String cityName, String pincode) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pincode = pincode;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", pincode=" + pincode + "]";
	}

	
	
}
