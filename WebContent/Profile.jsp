<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Profile</title>
<style>
.table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}
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
body
{
	background-color: #FAD961;
	background-image: linear-gradient(90deg, #FAD961 0%, #F76B1C 100%);
}
</style>
</head>
<%@include file="Header.jsp" %>
	<body>
	<s:if test="noData==true"><br><br>
		<center><table>
			<thead>
			<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Phone Number</th>
			<th>Email</th>
			</tr>
			</thead>
		<s:iterator value="beanList">
			<tr>
			<td><s:property value="ufname"/></td>
			<td><s:property value="ulname"/></td>
			<td><s:property value="unum"/></td>
			<td><s:property value="uemail"/></td>
			</tr>
		</s:iterator>
		</table></center><br><br>
		<center><a href="Updates"><button class="button button5">Update Profile</button></a></center><br>	
		<center><a href="Logout"><button class="button button5">Logout</button></a></center>
			
	</s:if>
	<s:else>
		<div style="color: red;">No Data Found.</div>
	</s:else>
	<s:if test="insert>0">
		<span style="color: red;"><s:property value="msgs" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msgs" /></span>
	</s:else>
	</body>
<%@include file="Footer.jsp" %>
</html>

