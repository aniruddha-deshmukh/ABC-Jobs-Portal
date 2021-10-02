<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="s" uri="/struts-tags" %>
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
            height: 200px;
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
        }
        
    </style>

<title>Login</title>
</head>
<%@include file="Header.jsp" %>
	<body>
	
	<center><h1>Login To Your Account</h1></center><br>
	<div class = "form-signup">
	<s:form action="adminLogin" method="post">
	<label class="email">
		<h2 style="position:absolute;">Email:</h2>
		<s:textfield name="uemail" cssClass="input" placeholder="Enter Your Email" />
	</label><br>
	<label class="pass">
		<h2 style="position:absolute;">Password:</h2>
		<s:password name="pword"  cssClass="input" placeholder="Enter Password" />
	</label><br>
		<s:submit value="Login" cssClass="submit"/>
	</s:form>
		<s:url value="Login.jsp" var="ADL" /><br>
		<center><s:a href="%{ADL}"><h3 style="color:black; ">Login as an User</h3></s:a></center>
	<s:if test="ctr>0">
	<span style="color: green;"><s:property value="messages" /></span>
	</s:if>
	<s:else>
		<div style="color: red;"><s:property value="messages" /></div>
	</s:else>
	</body>
<%@include file="Footer.jsp" %>
</html>