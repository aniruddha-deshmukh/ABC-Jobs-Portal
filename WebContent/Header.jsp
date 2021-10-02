<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Montserrat|PT+Sans+Caption&display=swap" rel="stylesheet">	
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: right;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: darkorange;
}
body{
  font-family: 'PT Sans Caption', sans-serif;
  font-family: 'Montserrat', sans-serif;
}

</style>
</head>
<body>

<ul>
 <a href="index.jsp"> <h2 style="float: left; color:white; margin-left:10px;">  ABC Jobs</h2></a> 
  <div style="margin-top:12px;">
  <li><a href="register.jsp">Register</a></li>
  <li><a href="Login.jsp">Login</a></li>
  </div>
</ul>

</body>
</html>
