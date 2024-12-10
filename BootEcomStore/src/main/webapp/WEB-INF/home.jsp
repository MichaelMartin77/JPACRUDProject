<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<%@ include file="bootstrapheader.jsp"%>
<link rel="stylesheet" href="/styles.css">
</head>
<body>
	<div class="container-fluid">

		<h3>Select your Order Id:</h3>
		<form action="getOrder.do" method="GET">
			Order Status: <input type="text" name="orderid" /> <input
				type="submit" value="Show Order" />
		</form>
	</div>

	<div class="container-fluid">
		<h3>Update Your Order Below:</h3>
		<form action="getUpdatedOrder.do" method="POST">
			<label>Enter the order to update:</label> <input type="text"
				name="id" /><br> <label>Order Status:</label> <input
				type="text" name="orderstatus" class="m3
		" /> <br> <label>Shipping
				Information:</label> <input type="text" name="shippinginfo" /> <br> <label>Payment
				Status:</label> <input type="text" name="paymentStatus" /> <br> <input
				type="submit" value="Update Order" />
		</form>
	</div>

	<div class="container-fluid">
		<h3>Create a new order</h3>
		<form action="createOrder.do" method="POST">
		<label>Please enter the new customer ID:</label>
		<input type="text" name="customerid" /><br>
		<label>Please enter the order Status:</label>
		<input type="text" name="orderstatus" /><br>
		<label>Please enter the shipping information:</label>
		<input type="text" name="shippinginfo" /><br>
		<label>Please enter the Payment Status:</label>
		<input type="text" name="paymentstatus" /><br>
		<label>Please enter the date the item was ordered:</label>
		<input type="text" name="orderdate" /><br>
		<input type="submit" value="Create Order" /><br>
		</form>
	</div>
	
	<%@ include file="bootstrapfooter.jsp"%>
</body>
</html>