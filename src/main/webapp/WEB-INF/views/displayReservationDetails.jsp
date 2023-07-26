<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>

AirLines:${reservation.fli.operatingAirlines}</br>
Flight No:${reservation.fli.flightNumber}</br>
Departure City:${reservation.fli.depatureCity}</br>
Arrival City:${reservation.fli.arrivalCity}</br>
Date Of Departure:${reservation.fli.dateOfDepatrure}</
Estimate Departure Time:${reservation.fli.estimatedDepatureTime}</br>

<h2>Passenger Details</h2>
First Name:${reservation.pass.firstName}</br>
Last Name:${reservation.pass.lastName}</br>
Email:${reservation.pass.email}</br>
Phone:${reservation.pass.phone}</br>

<form action="completeCheckIn">
Enter The Number Of Bags You Want To CheckIn<input type="text" name="numberOfBags"/>
<input type="hidden" value="${reservation.id}" name="reservationId">
<input type="submit" value="Check In">
</form>
</body>
</html>