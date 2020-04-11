package com.estore.ecommerce.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="SITE_INFORMATION")
public class SiteInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "support_email1")
	String supportEmail1;
	
	@Column(name = "support_email2")
	String supportEmail2;

	@Column(name = "support_mobile1")
	String supportMobile1;
	
	@Column(name = "support_mobile2")
	String supportMobile2;
	
	@Column(name = "address1")
	String address1;
	
	@Column(name = "address2")
	String address2;
	
	@Column(name = "address3")
	String address3;
	
	@Column(name = "map_x")
	String mapX;
	
	@Column(name = "map_y")
	String mapY;
	
	public SiteInformation() {
		
	}

	public SiteInformation(String supportEmail1, String supportEmail2, String supportMobile1,
			String supportMobile2, String address1, String address2, String address3, String mapX, String mapY) {
		this.supportEmail1 = supportEmail1;
		this.supportEmail2 = supportEmail2;
		this.supportMobile1 = supportMobile1;
		this.supportMobile2 = supportMobile2;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.mapX = mapX;
		this.mapY = mapY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupportEmail1() {
		return supportEmail1;
	}

	public void setSupportEmail1(String supportEmail1) {
		this.supportEmail1 = supportEmail1;
	}

	public String getSupportEmail2() {
		return supportEmail2;
	}

	public void setSupportEmail2(String supportEmail2) {
		this.supportEmail2 = supportEmail2;
	}

	public String getSupportMobile1() {
		return supportMobile1;
	}

	public void setSupportMobile1(String supportMobile1) {
		this.supportMobile1 = supportMobile1;
	}

	public String getSupportMobile2() {
		return supportMobile2;
	}

	public void setSupportMobile2(String supportMobile2) {
		this.supportMobile2 = supportMobile2;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getMapX() {
		return mapX;
	}

	public void setMapX(String mapX) {
		this.mapX = mapX;
	}

	public String getMapY() {
		return mapY;
	}

	public void setMapY(String mapY) {
		this.mapY = mapY;
	}
}