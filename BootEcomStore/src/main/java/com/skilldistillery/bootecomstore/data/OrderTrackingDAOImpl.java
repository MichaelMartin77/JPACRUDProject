package com.skilldistillery.bootecomstore.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderTrackingDAOImpl implements OrderTrackingDAO {

	@PersistenceContext
	private EntityManager em;

	
	@Override
	public OrderTracking create(OrderTracking order) {
		em.persist(order);
		System.out.println("Order persisted with ID: " + order.getId());
		return order;
	}

	@Override
	public OrderTracking update(int id, OrderTracking updatedOrder) {

		OrderTracking managed = em.find(OrderTracking.class, id);
		managed.setOrderStatus(updatedOrder.getOrderStatus());
		managed.setShippingInfo(updatedOrder.getShippingInfo());
		managed.setPaymentStatus(updatedOrder.getPaymentStatus());

		return managed;
	}

	@Override
	public boolean destory(int id) {
		OrderTracking order = em.find(OrderTracking.class, id);

		em.remove(order);

		return true;
	}

	@Override
	public OrderTracking findById(int id) {
		OrderTracking order = em.find(OrderTracking.class, id);
		return order;
	}

	public List<OrderTracking> findAll() {
		String jpql = "SELECT o FROM OrderTracking o";

		TypedQuery<OrderTracking> query = em.createQuery(jpql, OrderTracking.class);

		return query.getResultList();
	}

}
