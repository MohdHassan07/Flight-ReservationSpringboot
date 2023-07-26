<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t"%>
    <%@page isELIgnored="false" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>
<h2>Flights</h2>
<form action="findFlights" method="post">
<table border="1">
<tr><th>Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Time</th>



</tr>
<t:forEach var="flight" items="${flights}">
<tr>
<td>${flight.flightNumber}</td>
<td>${flight.operatingAirlines}</td>
<td>${flight.depatureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.dateOfDepatrure}</td>
<td>${flight.estimatedDepatureTime}</td>
<td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
</t:forEach>
</table>

</form>
</body>
</html>