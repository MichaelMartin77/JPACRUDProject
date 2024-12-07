package com.skilldistillery.jpaecommercestore.client;

import com.skilldistillery.jpaecommercestore.data.OrderTrackingDAO;
import com.skilldistillery.jpaecommercestore.data.OrderTrackingDAOImpl;
import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

public class OrderTrackingTestDAO {
	public static void main(String[] args) {
		OrderTrackingDAO dao = new OrderTrackingDAOImpl();

		OrderTracking order = new OrderTracking(105, "Delivered", "8451 Glenn Day Rd", "Paid");
		OrderTracking createdOrder = dao.create(order);
		

		int testId = createdOrder.getId(); // Replace with an ID that exists in the database
        OrderTracking foundOrder = dao.findById(testId);

        if (foundOrder != null) {
            System.out.println("Found Order:");
            System.out.println("ID: " + foundOrder.getId());
            System.out.println("Customer ID: " + foundOrder.getCustomerId());
            System.out.println("Order Status: " + foundOrder.getOrderStatus());
            System.out.println("Shipping Info: " + foundOrder.getShippingInfo());
            System.out.println("Payment Status: " + foundOrder.getPaymentStatus());
        } else {
            System.out.println("No order found with ID: " + testId);
        }
		
	}

}
