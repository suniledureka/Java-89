package co.edureka.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.entity.Employee;
import co.edureka.ems.services.EmployeeService;

public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static EmployeeService service = null;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-beans.xml");
		service = (EmployeeService)context.getBean("emp-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String eno = request.getParameter("eno");
		int empno = Integer.parseInt(eno);
		
		Employee emp = service.searchEmployeeById(empno);
			
		if(emp != null) {
			JSONObject json = new JSONObject();
			json.put("name", emp.getEmployeeName());
			json.put("salary", emp.getEmployeeSalary());
				
			response.setContentType("application/json");
			out.print(json);
		}
		else {
			response.setContentType("text/plain");
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
