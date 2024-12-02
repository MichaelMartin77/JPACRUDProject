package com.skilldistillery.jpaecommercestore.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class OrderTracking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "CustomerID")
	private int customerId;

	@Column(name = "OrderStatus")
	private String orderStatus;

	@Column(name = "ShippingInfo")
	private String shippingInfo;

	@Column(name = "PaymentStatus")
	private String paymentStatus;

	@Column(name = "OrderDate DATETIME")
	private LocalDateTime orderDate;

	// no-arg constructor
	public OrderTracking() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(String shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, id, orderDate, orderStatus, paymentStatus, shippingInfo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderTracking other = (OrderTracking) obj;
		return customerId == other.customerId && id == other.id && Objects.equals(orderDate, other.orderDate)
				&& Objects.equals(orderStatus, other.orderStatus) && Objects.equals(paymentStatus, other.paymentStatus)
				&& Objects.equals(shippingInfo, other.shippingInfo);
	}

	@Override
	public String toString() {
		return "OrderTracking [id=" + id + ", customerId=" + customerId + ", orderStatus=" + orderStatus
				+ ", shippingInfo=" + shippingInfo + ", paymentStatus=" + paymentStatus + ", orderDate=" + orderDate
				+ "]";
	}

}
