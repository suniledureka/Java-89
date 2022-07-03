package co.edureka.ems.services;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee emp) throws Exception;
	
	public void updateEmployee(Employee emp) throws Exception;
	
	public void deleteEmployee(Integer eno) throws Exception;
	
	public void searchEmployee(Integer eno) throws Exception;
	
	public void allEmployees() throws Exception;
}
