package co.edureka.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.models.Student;

@Path("/edureka")
public class StudentRegistration {
	@POST
	@Produces("text/html")
	@Path("/register")
	public String registerStudent(@FormParam("name_field") String name, @FormParam("age_field") String age, @FormParam("addr_field") String address) {
		//save student details in DB
		String response = "Name: "+name+"<br>Age: "+age+"<br>Address: "+address;
		return response;
	}
	
	@GET
	@Path("/students")
	@Produces("application/json")
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<Student>();
		//logic to get all Student details from DB
		
		Student st1 = new Student("Sunil",35,"Hyderabad");
		Student st2 = new Student("Ayush",26,"Bangalore");
		Student st3 = new Student("Archana",24,"Pune");
		Student st4 = new Student("Justin",23,"Delhi");
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		return students;
	}
}
