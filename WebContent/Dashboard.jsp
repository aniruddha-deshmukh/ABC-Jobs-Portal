<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://fonts.googleapis.com/css?family=Montserrat|PT+Sans+Caption&display=swap" rel="stylesheet">
<style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button5 {
  background-color: white;
  color: black;
  border: 2px solid #555555;
}

.button5:hover {
  background-color: #555555;
  color: white;
}
body,a,button{
  font-family: 'PT Sans Caption', sans-serif;
  font-family: 'Montserrat', sans-serif;
}
body
{
	background-color: #FAD961;
	background-image: linear-gradient(90deg, #FAD961 0%, #F76B1C 100%);
}
</style>
<title>Welcome</title>
</head>
<%@include file="Header.jsp" %>
<body><br><br>
	<center><h3>Welcome, you have logged in successfully <s:property value="uemail"/></h3></center>
	<center><a href="ViewProfile"><button class="button button5">My Profile</button></a></center><br>
	<center><a href="SearchUser.jsp"><button class="button button5">Search User</button></a></center><br>
	<center><a href="Logout"><button class="button button5">Logout</button></a></center>
	
</body>
<%@include file="Footer.jsp" %>
</html>