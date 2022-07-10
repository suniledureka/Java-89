<%@page isErrorPage="true"%>
<body bgcolor=maroon text=cyan>
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error --> " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Error ---> " + exception.getMessage());
 else
	 out.println("Internal Server Error");
%>
</h2>
</body>