package com.estore.ecommerce.ecommerce.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PURCHASE_TRANSACTION")
public class PurchaseTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "user_id")
	String userId;
	
	@Column(name = "product_id")
	String productId;
	
	@Column(name = "address_id")
	String addressId;
	
	@Column(name = "quantity")
	int quantity;

	@Column(name = "order_date")
	LocalDate orderDate;
	
	@Column(name = "scheduled_delivery_date")
	LocalDate scheduledDeliveryDate;
	
	@Column(name = "delivery_date")
	LocalDate deliveryDate;
	
	@Column(name = "transaction_mode")
	String transactionMode;
	
	public PurchaseTransaction() {
		
	}

	public PurchaseTransaction(String userId, String productId, String addressId, int quantity,
			LocalDate orderDate, LocalDate scheduledDeliveryDate, LocalDate deliveryDate, String transactionMode) {
		this.userId = userId;
		this.productId = productId;
		this.addressId = addressId;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.scheduledDeliveryDate = scheduledDeliveryDate;
		this.deliveryDate = deliveryDate;
		this.transactionMode = transactionMode;
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

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getScheduledDeliveryDate() {
		return scheduledDeliveryDate;
	}

	public void setScheduledDeliveryDate(LocalDate scheduledDeliveryDate) {
		this.scheduledDeliveryDate = scheduledDeliveryDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
}