<%!
 String uname;
 String pass;
%>
<h2>
<%
 uname = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 out.println("User Name = " + uname + "<br>");
 out.println("Password = " + pass);
%>
<hr>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Protocol = <%=request.getProtocol() %> <br>
HTTP Method = <%=request.getMethod() %> <br>
Content Type = <%=request.getContentType() %> <br>
Content Size = <%=request.getContentLength() %>
</h2> 