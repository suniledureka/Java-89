<html>
<head>
 <link rel="stylesheet" href="css/styles.css"/>
</head>
<body>
 <table>
  <tr>
   <td>
    <label>EMP NO</label>
   </td>
   <td>
     <input type="text" size=25 autofocus id="empid" onblur="getEmployeeDetails(this.value)"/>
   </td>   
  </tr>
  
  <tr>
   <td>NAME</td>
   <td><span id="emp-name">______________________</span></td>
  </tr>
  
  <tr>
   <td>SALARY</td>
   <td><span id="emp-sal">______________________</span></td>
  </tr>
  
 </table>
 <script src="js/script.js"></script>
</body>
</html>
