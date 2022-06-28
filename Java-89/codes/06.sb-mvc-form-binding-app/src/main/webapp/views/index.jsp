<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product entry</title>
<style>
 form{
   width:650px;
   background-color:maroon;
   margin:100px auto;
   padding:10px;
   border-radius:20px;
   box-shadow:0 0 10px black;
 }
 table{
  witdh:95%;
  font-size:20px;
  color:white;  
 }
 tr{
  height:50px;
 }
 input{
  font-size:18px;
 }
 p{
  text-align:center;
  color:blue;
  font-size:22px;    
 }
</style>
</head>
<body>
	<p>${msg}</p>	
	
	<form:form action="saveproduct" method="post" modelAttribute="product">
	  <table>
	    <tr>
	      <td>Product ID</td>
	      <td><form:input type="text" path="productId" size="25" autofocus="autofocus"/></td>
	    </tr>
	    
	    <tr>
	      <td>Name</td>
	      <td><form:input type="text" path="productName" size="25" /></td>
	    </tr>	    
	    
	    <tr>
	      <td>Price</td>
	      <td><form:input type="text" path="productPrice" size="25"></form:input></td>
	    </tr>	
	    
	    <tr>
	     <td colspan="2">
	       <td><input type=submit value="Save Product"/></td>	
	    </tr>    
	  </table>
	</form:form>
</body>
</html>