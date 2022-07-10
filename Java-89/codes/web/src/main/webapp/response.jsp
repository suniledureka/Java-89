<%
 String uname = request.getParameter("txt_uid");
 String pass = request.getParameter("txt_pwd");
 
 if(uname.equals("admin") && pass.equals("12345"))
	 response.sendRedirect("https://www.edureka.co");
 else
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid User Name / Password");
%>