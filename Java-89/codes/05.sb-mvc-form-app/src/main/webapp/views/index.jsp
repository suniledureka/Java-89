<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>
</head>
<body>
	<form action="saveproduct" method="post">
	  <table>
	    <tr>
	      <td>Product ID</td>
	      <td><input type="text" name="pid" size=25 autofocus/></td>
	    </tr>
	    
	    <tr>
	      <td>Name</td>
	      <td><input type="text" name="pname" size=25 /></td>
	    </tr>	    
	    
	    <tr>
	      <td>Price</td>
	      <td><input type="text" name="pprice" size=25/></td>
	    </tr>	
	    
	    <tr>
	     <td colspan="2">
	       <td><input type=submit value="Save Product"/></td>	
	    </tr>    
	  </table>
	</form>
</body>
</html>