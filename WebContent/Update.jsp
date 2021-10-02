<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
        body {
            padding: 0;
            margin: 0;
            font-family: arial;
			background-color: #FAD961;
			background-image: linear-gradient(90deg, #FAD961 0%, #F76B1C 100%);
		}

        form {
            margin-left: 75px;
            margin-top: 15px;
        }

        .form-signup {
            display: block;
            width: 650px;
            height: 230px;
            padding: 30px 20px 10px 20px;
            background: #0093E9;
            margin: 0 auto;
            margin-top: 10px;
            border-radius: 10px;
        }
        .form-signup label {
            margin-top: 0px;
            display: block;
            background: white;
            height: 34px;
            border-radius: 7px;
            width: 500px;
        }

        .form-signup .input {

            height: 25px;
            margin-top: 2px;
            margin-right: 2px;
            float: right;
            border-color:darkorange;
            border-radius: 5px;
            background: white;

        }


        .form-signup .update {
            border: none;
            background: darkorange;
            color: white;
            font-weight: bold;
            border-radius: 0px;
            cursor: pointer;
            padding: 5px 12px;
            display: block;
            margin-left: 215px;
        }

        .form-signup h2 {
            font-size: 20px;
            font-weight: bold;
            color: black;
            font-family: 'PT Sans Caption', sans-serif;
            margin-top: 5px;
            margin-left: 20px;
        }
        .form-signup h3 {
            
            font-weight: bold;
            color: black;
            font-family: 'PT Sans Caption', sans-serif;
            margin-top: 7px;
            margin-left: 400px;
        }
    </style>
<title>Update Profile</title>
</head>
<%@include file="Header.jsp" %>
<body>

<center><h1>Update Your Details</h1></center>
	<div class = "form-signup">
<s:form action="updatespls" method="post">
	<label>
		<h2 style="position:absolute;">First Name:</h2>
		<s:textfield cssClass="input" name ="ufname" placeholder = "Enter First Name"/>
	</label><br>
	<label>
		<h2 style="position:absolute;">Last Name:</h2>
		<s:textfield cssClass="input" name ="ulname" placeholder = "Enter Last Name"/>
	</label><br>
	<label>
		<h2 style="position:absolute;">Contact Number:</h2>	
		<s:textfield cssClass="input" name ="unum" placeholder = "Enter Contact Number"/>
	</label><br>
<br>
<s:submit cssClass="update" value="Update" />
</s:form>
</div>
</body>
<%@include file="Footer.jsp" %>
</html>