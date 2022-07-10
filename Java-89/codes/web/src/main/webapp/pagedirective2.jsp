<%@page errorPage="handler.jsp" %>
<%!
 int x = 10;
 int y = 5;
 //int y = 0;
 int[] marks = new int[8];
%>
<h2>
<%
 int res = x / y;
 out.println("result = " + res + "<br>");
 out.println(marks[10]);
%>
</h2>