package com.skilldistillery.jpaecommercestore.data;

import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

public interface OrderTrackingDAO {
	public OrderTracking create(OrderTracking order);
	public OrderTracking update(int id, OrderTracking updatedOrder);
	public boolean destory(int id); 
	OrderTracking findById(int id); 
}
