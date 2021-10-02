<!DOCTYPE html>
<html>
<head>
<title>Password Sent!</title>
<style>
	.row
	{
		background-color: black;
	    margin: auto;
	    
	}
	.logo img
	{
	    width: 150px;
	    height: auto;
	    margin-left: 50px
	}
	.main-nav
	{
	    float: right;
	    list-style: none;
	    margin-top: 38px;
		padding-right: 38px;
	   max-width: 1200px;
	}
	.main-nav li
	{
	    display: inline-grid;
	}
	
	.main-nav li.active a
	{
	    border: 1px solid darkorange;
	    
	}
	
	.main-nav li a:hover
	{
	    border: 1px solid darkorange;
	}
	
	
	.main-nav li a
	{
	    color: white;
	    text-decoration: none;
	    padding: 7px 28px;
	    font-family: "Roboto", sans-serif;
	    font-size: 15px;
	}
		body
	{
		background-color: #FAD961;
		background-image: linear-gradient(90deg, #FAD961 0%, #F76B1C 100%);
	}
</style>
</head>
<%@include file="Header.jsp" %>
<body>
<br><br><br><br>
<center><img style="width: 400px; height: 150px;" src="images/process.png" alt="Done"></center><br><br><br>

<h2 style="text-align: center;">Request Processed!<br>Password Successfully Sent to Your Email Address !..</h2>

<%@include file="Footer.jsp" %>

</body>
</html>