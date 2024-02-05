package DbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection getCon()  {
		Connection cn = null;
		try {
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/feeManagments","root","2001");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;}

}
