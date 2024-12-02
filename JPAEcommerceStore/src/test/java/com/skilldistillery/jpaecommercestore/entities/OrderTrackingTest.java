package com.skilldistillery.jpaecommercestore.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class OrderTrackingTest {
	private static EntityManagerFactory emf; 
	private static EntityManager em; 
	private OrderTracking orderTracking; 
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("EcommerceStore"); 
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close(); 
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager(); 
		
		orderTracking = em.find(OrderTracking.class, 1); 
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		orderTracking = null; 
	}

	@Test
	void test_OrderTracking_basic_mappings() {
		assertNotNull(orderTracking); 
		assertEquals(101, orderTracking.getCustomerId());
		assertEquals("Shipped", orderTracking.getOrderStatus());
		assertEquals("324 Elm St Rd", orderTracking.getShippingInfo());
		assertEquals("Paid", orderTracking.getPaymentStatus());
		assertNotNull(orderTracking.getOrderDate()); 
		
	}

}
