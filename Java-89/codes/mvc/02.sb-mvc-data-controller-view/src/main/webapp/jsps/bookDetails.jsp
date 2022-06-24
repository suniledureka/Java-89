<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
 body{   
   background-color:lightgreen;
 }
 h2{
  text-align:center;
 }
 table{
   width:600px;
   margin:100px auto;
   font-size:18px;
   border-collapse:collapse;
   box-shadow:0 0 10px black;
   color:maroon;
 }
 td,th{
  border:1px solid black;
  padding:4px;
 }
 tr{
   height:45px;
 }
</style>
<title>posidex library</title>
</head>
<body>
	<h2>POSIDEX || LIBRARY </h2>
	
	<table>
	  <tr>
	    <td>BOOK ID</td>
	    <td>${book.bookId}
	  </tr>
	  <tr>
	    <td>TITLE</td>
	    <td>${book.bookTitle}
	  </tr>	  
	  <tr>
	    <td>PRICE</td>
	    <td>${book.bookPrice}
	  </tr>	  
	</table>
	<hr>
</body>
</html>