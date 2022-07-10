<jsp:useBean id="emp" class="co.edureka.web.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="emp"/>
<h2>
Emp No = <jsp:getProperty property="empNo" name="emp"/> <br>
Name = <jsp:getProperty property="empName" name="emp"/> <br>
Salary = <jsp:getProperty property="empSal" name="emp"/> <br>
<hr>
</h2>