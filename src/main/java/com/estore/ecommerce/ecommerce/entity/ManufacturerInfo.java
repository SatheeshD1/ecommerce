package com.estore.ecommerce.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MANUFACTURER_INFO")
public class ManufacturerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "manufacturer_id")
	String manufacturerId;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "mobile")
	String mobile;
	
	@Column(name = "street")
	String street;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "pincode")
	String pincode;
	
	@Column(name = "state")
	String state;
	
	public ManufacturerInfo() {
		
	}

	public ManufacturerInfo(int id, String manufacturerId, String name, String mobile, String street, String address,
			String city, String pincode, String state) {
		super();
		this.id = id;
		this.manufacturerId = manufacturerId;
		this.name = name;
		this.mobile = mobile;
		this.street = street;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}