package com.estore.ecommerce.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="DELIVERY_ADDRESS")
public class DeliveryAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "user_id")
	String userId;
	
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
	
	public DeliveryAddress() {
		
	}

	public DeliveryAddress(String userId, String name, String mobile, String street, String address,
			String city, String pincode, String state) {
		this.userId = userId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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