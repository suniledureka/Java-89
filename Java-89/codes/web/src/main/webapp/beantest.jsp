<jsp:useBean id="emp" class="co.edureka.web.Employee"></jsp:useBean>
<h2>
Emp No = <jsp:getProperty property="empNo" name="emp"/> <br>
Name = <jsp:getProperty property="empName" name="emp"/> <br>
Salary = <jsp:getProperty property="empSal" name="emp"/> <br>
<hr>
<jsp:setProperty property="empName" name="emp" value="Sunil Joseph"/>
Name = <jsp:getProperty property="empName" name="emp"/> <br>
</h2>