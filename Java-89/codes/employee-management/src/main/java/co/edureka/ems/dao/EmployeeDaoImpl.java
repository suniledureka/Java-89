package co.edureka.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.ems.configs.ConnectionFactory;
import co.edureka.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	private Statement st = null;
	
	public EmployeeDaoImpl() throws Exception{
		Connection con = ConnectionFactory.getDbConnection();
		st = con.createStatement();
	}
	
	public Integer saveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmployeeNo()+",'"+emp.getEmployeeName()+"',"+emp.getEmployeeSalary()+")";
		int employeeSaved = st.executeUpdate(sql);
		return employeeSaved;
	}

	public Integer updateEmployee(Employee emp) throws Exception {
		String sql = "update emp set ename = '"+emp.getEmployeeName()+"', sal="+emp.getEmployeeSalary()+" where empno="+emp.getEmployeeNo();
		int employeeUpdated = st.executeUpdate(sql);
		return employeeUpdated;
	}

	public Integer deleteEmployeeById(Integer eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		int employeeDeleted = st.executeUpdate(sql);
		return employeeDeleted;
	}

	public Employee findEmployeeById(Integer eno) throws Exception {
		String sql = "select ename, sal from emp where empno="+eno;
		Employee emp = null;
		
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String name = rs.getString(1);
			float sal = rs.getFloat(2);
			emp = new Employee(eno, name, sal);
		}
		
		return emp;
	}

	public List<Employee> findAllEmployees() throws Exception {
		String sql = "select * from emp";
		List<Employee> emps = new ArrayList<Employee>();
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			Integer eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			Employee emp = new Employee(eno, name, sal);
			emps.add(emp);
		}
		
		return emps;
	}

}
