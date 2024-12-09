package com.skilldistillery.bootecomstore.data;

import java.util.List;

import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

public interface OrderTrackingDAO {
	public OrderTracking create(OrderTracking order);
	public OrderTracking update(int id, OrderTracking updatedOrder);
	public boolean destory(int id); 
	OrderTracking findById(int id); 
	List<OrderTracking> findAll();
}
