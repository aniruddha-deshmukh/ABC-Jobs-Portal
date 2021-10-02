<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Users</title>
<style type="text/css">
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
            height: 325px;
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

            height: 35px;
            width: 350px;
            margin-top: 2px;
            margin-left: 25px;
            margin-right: 2px;
            border-color:darkorange;
            border-radius: 5px;
            background: white;

        }


        .form-signup .submit {
            border: none;
            height: 35px;
            margin-top: 2px;
            margin-right: 120px;
            float:right;
            background: darkorange;
            color: white;
            font-weight: bold;
            border-radius: 0px;
            cursor: pointer;
            padding: 5px 12px;
            display: block;
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
<body>
<%@include file="Header.jsp" %>
        <div class="form-signup">
            <s:form method="post" action="searching">
				<s:textfield cssClass="input" type="search" name="profiles" placeholder=" Search Users by Name" required="true" />
			<s:submit value="Search" id="search" cssClass="submit"/>
    	<br><br>
    <s:actionmessage />
    <s:iterator value="userbean">
      <label><h2>First Name : <s:property value="ufname" /></h2></label>
        <br>
      <label><h2>Last Name : <s:property value="ulname" /></h2></label>
        <br>
      <label><h2>Base Qualification : <s:property value="ubasequali" /></h2></label>
        <br>
      <label><h2>Contact Number : <s:property value="unum" /></h2></label>
    </s:iterator>
    </s:form>
  </div>
<br><br><br><br><br>
<%@include file="Footer.jsp" %>
</body>
</html>