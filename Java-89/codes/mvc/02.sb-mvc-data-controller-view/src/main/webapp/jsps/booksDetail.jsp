<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
 h2{
  text-align:center;
 }
 table{
   width:600px;
   margin:100px auto;
   font-size:18px;
   border-collapse:collapse;
   box-shadow:0 0 10px black;   
 }
 td,th{
  border:1px solid black;
  padding:4px;
 }
 tr{
   height:45px;
 }
 thead tr{
   background-color:black;
   color:white;
 }
</style>
<title>posidex library</title>
</head>
<body>
	<h2>POSIDEX || LIBRARY </h2>
	
	<table>
	  <thead>
	    <tr>
	       <th>BOOK ID</th>
	       <th>TITLE</th>
	       <th>PRICE</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${books}" var="book">
	  		<tr>
	  		  <td>${book.bookId}</td>
	  		  <td>${book.bookTitle}</td>
	  		  <td>${book.bookPrice}</td>
	  		</tr>
	  	</c:forEach>
	  </tbody>
	</table>
	<hr>
</body>
</html>