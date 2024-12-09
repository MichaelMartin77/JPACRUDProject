<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<%@ include file="bootstrapheader.jsp"%>
</head>
<body>
	<div class="container-sm" style="margin: 5px;">

		<h3>Select your Order Id:</h3>
		<form action="getOrder.do" method="GET">
			Order Status: <input type="text" name="orderid" /> <input
				type="submit" value="Show Order" />
		</form>
	</div>

	<div class="container-fluid">
		<h3>Update Your Order Below:</h3>
		<form action="getUpdatedOrder.do" method="POST" class="m">
			<label>Enter the order to update:</label> <input type="text"
				name="id" /><br> <label>Order Status:</label> <input
				type="text" name="orderstatus" /> <br> <label>Shipping
				Information:</label> <input type="text" name="shippinginfo" /> <br> <label>Payment
				Status:</label> <input type="text" name="paymentStatus" /> <br> <input
				type="submit" value="Update Order" />
		</form>
	</div>
	<%@ include file="bootstrapfooter.jsp"%>
</body>
</html>