<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: white;
	background-color: #FAD961;
	background-image: linear-gradient(90deg, #FAD961 0%, #F76B1C 100%);
}

.container {
  padding: 16px 500px;
  background-color: lightblue;
}


input[type=text], input[type=password] {
  width: 238%;
  padding: 15px;
  margin:  5px 0 22px 0;	
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}


hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}


.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  margin-left:235px;
}

.registerbtn:hover {
  opacity: 1;
}

a {
  color: dodgerblue;
}

</style>
</head>
<body>
<%@include file="Header.jsp" %>
<div class="container">
<h1>
Enter Your New Password!
</h1>
<br>
<h3> We will update your old password with the new one</h3>
<hr>
<s:form action="confirmPassUser" method="post">
<s:password label="Password" name="Password" />
<s:password label="Confirm Password" name="C-Password" />
<s:submit cssClass="registerbtn" value="Submit" />
</s:form>
</div>
<br><br><br><br><br><br><br><br><br><br>
<%@include file="Footer.jsp" %>
</body>
</html>