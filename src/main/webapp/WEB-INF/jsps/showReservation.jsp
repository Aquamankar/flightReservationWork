<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESERVATION DETAILS</title>
</head>
<body>
	<h2>FLIGHT DETAILS</h2>
	FLIGHT NUMBER :${flight.flightNumber}
	<br /> OPERATING AIRLINES :${flight.operatingAirlines}
	<br /> DEPARTURE CITY :${flight.departureCity}
	<br /> ARRIVAL CITY :${flight.arrivalCity}
	<br /> DEPARTURE DATE :${flight.dateOfDeparture}
	<br />
	<h2>ENTER PASSENGER DETAILS</h2>
	<form action="confirmReservation" method="post">
		<pre>
FIRST NAME <input type="text" name="firstName" />
LAST NAME <input type="text" name="lastName" />
MIDDLE NAME <input type="text" name="middleName" />
EMAIL <input type="text" name="email" />
PHONE <input type="text" name="phone" />
<input type="hidden" name="flightId" value="${flight.id}" />
<h2>ENTER THE PAYMENT DETAILS</h2>
NAME ON THE CARD<input type="text" name="nameOfTheCard" />
CARD NUMBER <input type="text" name="cardNumber" />
CVV <input type="text" name="cvv" />
EXPIRY DATE <input type="text" name="expiryDate" />
<input type="submit" value="Complete Reservation" />
</pre>
	</form>
</body>
</html>