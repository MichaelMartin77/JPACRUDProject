<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Information Page</title>
<%@ include file="bootstrapheader.jsp"%>
</head>
<body>
	<div class="container-fluid">
		<h3>Order Details:</h3>
		<h4>Customer Id:</h4>
		<p>${order.customerId}</p>
		<h4>Order Status:</h4>
		<p>${order.orderStatus}</p>
		<h4>Shipping Information:</h4>
		<p>${order.shippingInfo}</p>
		<h4>Payment Status:</h4>
		<p>${order.paymentStatus}</p>
		<h4>Order Date:</h4>
		<p>${order.orderDate}</p>
		<a href="home.jsp">Return Home</a>
	</div>

	<%@ include file="bootstrapfooter.jsp"%>
</body>
</html>