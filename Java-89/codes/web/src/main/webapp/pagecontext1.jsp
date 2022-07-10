<h2>
<%
  String uname = request.getParameter("txt_uid");
  out.println("Hello, " + uname);
  pageContext.setAttribute("name", uname, PageContext.SESSION_SCOPE);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>