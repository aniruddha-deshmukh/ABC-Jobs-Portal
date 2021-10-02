<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
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
            height: 150px;
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


        .form-signup .submit {
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

</head>
<%@include file="Header.jsp" %>
	<body>
	<div class="container">
	<br>
		<center><h1>Reset Password</h1>
		<h3> No Worries, We got your back! </h3></center>
		<div class = "form-signup">
		<s:form action="resetmail" method="post">
		<label>
		<h2 style="position:absolute;">Enter Your Registered Email:</h2>
		<s:textfield name="email" cssClass="input" type="user.email" id="mail" placeholder="Enter Email Address" />
		</label><br><br>
		<s:submit cssClass="submit" value="Submit" />
		</s:form>
		</div>
		<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
		</s:if>
		<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
		</s:else>
	</div>
	</body>
	<%@include file="Footer.jsp" %>
</html>