package com.skilldistillery.jpaecommercestore.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;


public class OrderTracking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="OrderID")
	private int orderId; 
	
	@Column(name = "CustomerID")
    private int customerId; 
	
	@Column(name="OrderStatus")
	private String shippingInfo; 
	
	@Column(name="PaymentStatus")
	private String paymentStatus; 
	
	@Column(name="OrderDate")
	private LocalDateTime orderDate; 
	
	
}
