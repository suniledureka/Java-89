package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		
		CallableStatement cst = con.prepareCall("{call hike_salary(?,?,?)}");
		
		int eno = 101;
		int salPercentage = 10;
		
		cst.setInt(1, eno);
		cst.setInt(2, salPercentage);
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.println("updated salary = " + cst.getFloat(3));
		
		cst.close();
		con.close();
	}

}
