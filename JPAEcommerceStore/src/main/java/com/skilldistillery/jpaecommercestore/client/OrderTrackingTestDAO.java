package com.skilldistillery.jpaecommercestore.client;

import com.skilldistillery.jpaecommercestore.data.OrderTrackingDAO;
import com.skilldistillery.jpaecommercestore.data.OrderTrackingDAOImpl;
import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

public class OrderTrackingTestDAO {
	public static void main(String[] args) {
		OrderTrackingDAO dao = new OrderTrackingDAOImpl();

		OrderTracking order = new OrderTracking(105, "Shipped", "4681 Glendale Rd", "Paid");
		OrderTracking createdOrder = dao.create(order);
		
//		OrderTracking order = new OrderTracking(105, "Shipped", "4681 Glendale Rd", "Paid");
//		OrderTracking result = dao.update(6, order);
		
//		dao.destory(6);
		
		
	}

}
