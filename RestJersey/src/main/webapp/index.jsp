<html>
<body>
    <h2>Car Booking System</h2>
    <p><a href="webapi/myresource/get">Get Bookings</a>
	</p>
	
	<form action= "webapi/myresource/createBooking" method="post">
		<br/> Cust ID <br/>
		<input type="number" name="CustID" style="height:30px;width:200px"/>
		<br/> Hire Date (yyyy-mm-dd)<br/>
		<input type="text" name="HireDate" style="height:30px;width:200px"/>
		<br/> Return Date (yyyy-mm-dd)<br/>
		<input type="text" name="ReturnDate" style="height:30px;width:200px"/>
		<br/> Car ID <br/>
		<input type="number" name="CarID" style="height:30px;width:200px"/>
		<br/><br/>
		<input type="submit" value="Make a Booking" style="height:30px;width:200px"/>
	</form>
	
	<form action= "webapi/myresource/deleteBooking" method="post">
		<br/> Booking ID <br/>
		<input type="number" name="BookingID" style="height:30px;width:200px"/>
		<br/><br/>
		<input type="submit" value="Delete a Booking" style="height:30px;width:200px"/>
	</form>
	
	<form action= "webapi/myresource/updateBooking" method="post">
		<br/> Your Customer ID <br/>
		<input type="number" name="CustID" style="height:30px;width:200px"/>
		<br/> New HireDate (yyyy-mm-dd)<br/>
		<input type="text" name="HireDate" style="height:30px;width:200px"/>
		<br/> New ReturnDate (yyyy-mm-dd)<br/>
		<input type="text" name="ReturnDate" style="height:30px;width:200px"/>
		<br/> New Car ID <br/>
		<input type="number" name="CarID" style="height:30px;width:200px"/>
		<br/><br/>
		<input type="submit" value="Update a Booking" style="height:30px;width:200px"/>
	</form>
	
	
</body>
</html>
