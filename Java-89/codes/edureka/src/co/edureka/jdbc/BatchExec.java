package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(106,'employee-1',2500)");
		st.addBatch("insert into emp values(107,'employee-2',3500)");
		//st.addBatch("insert into emp values(106,'employee-3',4500)");
		st.addBatch("insert into emp values(108,'employee-3',4500)");
		st.addBatch("update emp set sal = 6000");
		
		try {
			int[] rows = st.executeBatch();
			for(int n : rows) {
				System.out.println("rows affected = " + n);
			}
			con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		
		st.close();
		con.close();
	}

}
