<%!
 String company = "edureka limited"; //instance variable

 public int add(int x, int y){
	 return x + y;
 }
%>
<h2>
My Company Name = <%=company %>
<br>
<%="sum = " + add(23,21) %>
</h2>