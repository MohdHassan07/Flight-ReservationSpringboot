<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title >Registration Form</title>
</head>

<body>

  
    <center><h2 >Registration Form</h2></center>
    <form action="registerUser" method="post">
    
      <table style="margin:auto" border="2">
       <tr><td>FirstName:</td><td>
        <input type="text" placeholder="firstName" name="firstName" required></br>
      </td></tr>
      
      
      <tr><td>LirstName:</td><td>
        <input type="text" placeholder="lastName" name="lastName" required></br>
      </td></tr>
      
      <tr><td>Email:</td><td>
        <input type="text" placeholder="email" name="email" required></br>
      </td></tr>
      
       <tr><td>Password:</td><td>
        <input type="password" placeholder="password" name="password" required></br>
      </td></tr>      

      
      <tr><td>
        <input type="Submit" value="Register Now"></td></tr>
      
      
      
    </form>
    </table>
  	

</body>
</html>
 