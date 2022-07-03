package co.edureka.except;

import java.sql.SQLException;

class UserService{
	public void findUserDetailsById(int uid) throws SQLException {
		//logic to get user details;
		System.out.println("-- user details ---");
	}
}


public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService obj = new UserService();
		try {
			obj.findUserDetailsById(101);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
	}

}
