package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

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
}
