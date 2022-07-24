package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices 
{
	@GET
	@Produces("text/html")
	public String localService() {
		return "<h2>Edureka :: India Customer Service Center</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalService() {
		return "<h2>Edureka :: International Customer Service Center</h2>";
	}	
	
	@GET
	@Produces("txt/html")
	@Path("/enquiry/{name}/{course}")
	public String getCourseDetails(@PathParam("name") String name, @PathParam("course") String course) {
		//get course details from DB
		String response = "Hello "+name+", we will revert to you with all the details for the Course: "+course;
		return response;
	}
	
	@GET
	@Produces("txt/html")
	@Path("/enquiry")
	public String getCourseDetailsByQueryParams(@QueryParam("name") String name, @QueryParam("course") String course) {
		//get course details from DB
		String response = "Hello "+name+", your enquiry for Course="+course+" is received through query parameters";
		return response;
	}	
}
