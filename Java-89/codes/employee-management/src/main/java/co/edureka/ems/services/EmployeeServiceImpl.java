package co.edureka.ems.services;

import java.util.List;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dao.EmployeeDaoImpl;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;
	
	public EmployeeServiceImpl() throws Exception{
		dao = new EmployeeDaoImpl();
	}
	
	public void saveEmployee(Employee emp) throws Exception {
		Integer n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("###--- Employee Saved ---###");
	}

	public void updateEmployee(Employee emp) throws Exception {
		Integer n = dao.updateEmployee(emp);
		if(n > 0)
			System.out.println("###--- Employee Updated ---###");
		else
			System.out.println("###--- No Matching Employee for Updation ---###");
	}

	public void deleteEmployee(Integer eno) throws Exception {
		Integer n = dao.deleteEmployeeById(eno);
		if(n > 0)
			System.out.println("###--- Employee Deleted ---###");
		else
			System.out.println("###--- No Matching for Deletion ---###");
	}	

	public void searchEmployee(Integer eno) throws Exception {
		Employee emp = dao.findEmployeeById(eno);
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("###--- No Matching Employee found ---###");
	}

	public void allEmployees() throws Exception {
		List<Employee> employees = dao.findAllEmployees();
		for(Employee emp : employees) {
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}

}
