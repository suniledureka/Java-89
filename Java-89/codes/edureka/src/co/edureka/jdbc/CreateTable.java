package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect MySQL db_edureka database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create an object for passing SQL query to connected DB
		Statement st = con.createStatement();
		
		//-- pass the query to create Database table with name emp
		String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("###--- Database Table Created ---###");
		}
		catch(Exception ex) {
			System.out.println("Database Table could not be created");
			System.out.println("Reason --> " + ex.toString());
		}
		
		//-- close connection with Database
		st.close();
		con.close();
	}

}
