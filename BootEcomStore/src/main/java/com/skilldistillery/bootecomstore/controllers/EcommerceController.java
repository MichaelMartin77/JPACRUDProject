package com.skilldistillery.bootecomstore.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.bootecomstore.data.OrderTrackingDAO;
import com.skilldistillery.bootecomstore.data.OrderTrackingDAOImpl;
import com.skilldistillery.jpaecommercestore.entities.OrderTracking;

@Controller
public class EcommerceController {
	private final OrderTrackingDAO dao; 
	
	public EcommerceController(OrderTrackingDAO dao) {
		this.dao = dao; 
	}
	
	@GetMapping(path= {"/", "home.do"})
	public String index (Model model) {
		return "home"; 
	}
	
	@GetMapping(path = "getOrder.do")
	public String getOrderById(@RequestParam("orderid") int id, Model model) {
		OrderTracking order = dao.findById(id);
		model.addAttribute("order", order); 
		return "show";
	}
	
	@PostMapping(path = "getUpdatedOrder.do")
	public String updateOrder(@RequestParam("id") int orderId, 
			@RequestParam("orderstatus") String orderStatus,
			@RequestParam("shippinginfo") String shippingInfo,
			@RequestParam("paymentStatus") String paymentStatus, 
			Model model) {
		OrderTracking currentOrder = dao.findById(orderId); 
		
		
		currentOrder.setOrderStatus(orderStatus);
		currentOrder.setShippingInfo(shippingInfo);
		currentOrder.setPaymentStatus(paymentStatus);
		
		OrderTracking updatedOrder = dao.update(orderId, currentOrder); 
		
		model.addAttribute("updatedOrder", updatedOrder); 
		
		return "orderUpdated";
	}

}
