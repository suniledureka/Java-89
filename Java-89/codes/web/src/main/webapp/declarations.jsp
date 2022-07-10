<%!
 String company = "edureka limited"; //instance variable

 public int add(int x, int y){
	 return x + y;
 }
%>
<h2>
<%
 out.println("My Company = " + company + "<br>");
 out.println("Sum = " + add(12, 34));
%>
</h2>