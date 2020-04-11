package com.estore.ecommerce.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_MASTER")
public class ProductMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "product_id")
	String productId;
	
	@Column(name = "name")
	String name;

	@Column(name = "available_quantity")
	int availableQuantity;
	
	@Column(name = "price")
	int price;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "availability")
	String availability;
	
	@Column(name = "image_id")
	String imageId;
	
	@Column(name = "brand")
	String brand;
	
	@Column(name = "size")
	int size;
	
	public ProductMaster() {
		
	}
	
	public ProductMaster(String productId, String name, int availableQuantity, int price, String description,
			String availability,String imageId, String brand, int size) {
		this.productId = productId;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
		this.description = description;
		this.availability = availability;
		this.imageId = imageId;
		this.brand = brand;
		this.size = size;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}