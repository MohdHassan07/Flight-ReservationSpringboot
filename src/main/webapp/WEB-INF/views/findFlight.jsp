<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title >User Login</title>
</head>

<body>
<h1><a href="FlightDetails.jsp">Click Here</a></h1>
<h2>Find Flight</h2>
<form action="findFlights" method="post">
From:<input type="text" name="from">
To:<input type="text" name="to">
Departure Date:<input type="text" name="dateOfDepatrure">
<input type="submit" value="find">




</form>
</body>
</html>