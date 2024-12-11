package com.skilldistillery.jpaecommercestore.client;

import java.util.List;

import com.skilldistillery.jpaecommercestore.data.OrderTrackingDAO;
import com.skilldistillery.jpaecommercestore.data.OrderTrackingDAOImpl;
import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

public class OrderTrackingTestDAO {
	public static void main(String[] args) {
		OrderTrackingDAO dao = new OrderTrackingDAOImpl();
	
        List<OrderTracking> foundOrder = dao.findAll(); 

       System.out.println(foundOrder);
		
	}

}
