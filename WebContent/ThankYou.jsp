<!DOCTYPE html>
<html>
<head>
<title>Thank You!</title>
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
<h1 style="text-align: center; background:white;">Thank You</h1><br>
<center><img style="width:700px; height: 350px;" src="images/regist.png" alt="Thank You"></center><br><br><br>
<html>
<h2 style="text-align: center;">Thank You for registering with us!<br>We will be in touch shortly!....</h2>
</html>
<%@include file="Footer.jsp" %>

</body>
</html>