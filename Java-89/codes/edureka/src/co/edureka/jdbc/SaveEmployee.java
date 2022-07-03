package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		/*
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		*/
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101, 'Sunil Joseph', 2750.50)";
		String sql = "insert into emp(empno,ename,sal) values(102, 'Anil', 3750.50), (103, 'Praveen', 4750.50),"
				+ "(104, 'Sanjay Kumar', 5785), (105, 'Krishna', 8500)";
		
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("Employees Saved --> " + employeesSaved);
		}
		catch(Exception ex) {
			System.out.println("Error --> " + ex.toString());
		}
		
		st.close();
		con.close();

	}

}
