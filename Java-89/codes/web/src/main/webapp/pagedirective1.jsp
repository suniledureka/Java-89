<%@page import="java.util.Date" info="jsp page to understand page directive" language="java" contentType="text/html; charset=ISO-8859-1"%>
<body style="text-align:center;color:blue">
<h2>
<%
 Date today = new Date();
 out.println(today);
%>
<hr>
<%=getServletInfo() %>
</h2>
</body>