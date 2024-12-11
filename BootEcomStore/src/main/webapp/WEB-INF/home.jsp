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
	<div class="welcome"> 
	<h1>Welcome!</h1>
	<p>Create, Read, Update, or Delete an Order</p>
	</div>	
	<div class="container">
		<div class="container-fluid">
			<h4>Select Your Order Id:</h4>
			<form action="getOrder.do" method="GET">
				Order Status: <input type="text" name="orderid" class="form-control" />
				<input type="submit" value="Show Order" class="btn btn-primary" />
			</form>
		</div>

		<div class="container-fluid">
			<h4>Update Your Order Below:</h4>
			<form action="getUpdatedOrder.do" method="POST">
				<label>Enter the order to update:</label> <input type="text"
					name="id" class="form-control" /><br> <label>Order
					Status:</label> <input type="text" name="orderstatus" class="form-control" " />
				<br> <label>Shipping Information:</label> <input type="text"
					name="shippinginfo" class="form-control" /> <br> <label>Payment
					Status:</label> <input type="text" name="paymentStatus"
					class="form-control" /> <br> <input type="submit"
					value="Update Order" class="btn btn-primary" />
			</form>
		</div>

		<div class="container-fluid">
			<h4>Create A New Order</h4>
			<form action="createOrder.do" method="POST">
				<label>Please enter the new customer ID:</label> <input type="text"
					name="customerid" class="form-control" /><br> <label>Please
					enter the order Status:</label> <input type="text" name="orderstatus"
					class="form-control" /><br> <label>Please enter the
					shipping information:</label> <input type="text" name="shippinginfo"
					class="form-control" /><br> <label>Please enter the
					Payment Status:</label> <input type="text" name="paymentstatus"
					class="form-control" /><br> <label>Please enter the
					date the item was ordered:</label> <input type="text" name="orderdate"
					class="form-control" /><br> <input type="submit"
					value="Create Order" class="btn btn-primary" /><br>
			</form>
		</div>

		<div class="container-fluid">
			<h4>Delete Order By Id</h4>
			<form action="deleteOrder.do" method="POST">
				<label>Please enter the new customer ID:</label> <input type="text"
					name="id" class="form-control" /><br> <input type="submit"
					value="Delete Order" class="btn btn-primary" /><br>
			</form>
		</div>
	</div>

	<%@ include file="bootstrapfooter.jsp"%>
</body>
</html>