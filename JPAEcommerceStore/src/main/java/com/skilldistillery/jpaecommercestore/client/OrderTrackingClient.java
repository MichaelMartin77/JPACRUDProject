package com.skilldistillery.jpaecommercestore.client;

import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OrderTrackingClient {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceStore");
		EntityManager em = emf.createEntityManager();

		OrderTracking orderTracking = em.find(OrderTracking.class, 1);

		em.close();
		emf.close();
	}
	
	
}
