package com.skilldistillery.jpaecommercestore.data;

import java.util.List;

import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class OrderTrackingDAOImpl implements OrderTrackingDAO {

	@Override
	public OrderTracking create(OrderTracking order) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceStore");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		em.persist(order);

		em.getTransaction().commit();

		return order;
	}

	@Override
	public OrderTracking update(int id, OrderTracking updatedOrder) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceStore");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		OrderTracking managed = em.find(OrderTracking.class, id); 
		managed.setCustomerId(updatedOrder.getCustomerId());
		managed.setOrderStatus(updatedOrder.getOrderStatus());
		managed.setShippingInfo(updatedOrder.getShippingInfo());
		managed.setPaymentStatus(updatedOrder.getPaymentStatus());
		
		
		em.getTransaction().commit();
		
		return managed;
	}

	@Override
	public boolean destory(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceStore");
		EntityManager em = emf.createEntityManager();
		
		OrderTracking order = em.find(OrderTracking.class, id);
		em.getTransaction().begin();
		
		em.remove(order);
		
		em.getTransaction().commit();
		
		return true;
	}

	@Override
	public OrderTracking findById(int id) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceStore");
	    EntityManager em = emf.createEntityManager();
	    
	    try {
	        
	        OrderTracking order = em.find(OrderTracking.class, id);
	        return order;
	    } finally {
	        
	        em.close();
	    }
	}
	
	public List<OrderTracking> findAll() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceStore");
		    EntityManager em = emf.createEntityManager();
		String jpql = "SELECT o FROM OrderTracking o";

		TypedQuery<OrderTracking> query = em.createQuery(jpql, OrderTracking.class);

		return query.getResultList();
	}

}
