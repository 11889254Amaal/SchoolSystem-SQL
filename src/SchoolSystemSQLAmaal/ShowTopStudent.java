package SchoolSystemSQLAmaal;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowTopStudent {
	public long ShowTop() throws ClassNotFoundException{
		String sqlDB = " SELECT * FROM Students LIMIT 100"; 
				
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String username = "root";
		String password = "root";
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			ResultSet m = st.executeQuery(sqlDB);
			if (m.next()) {
				do {
					System.out.println("id : " + m.getInt(1));
					System.out.println("fname :" + m.getString(2));
					System.out.println("lname :" + m.getString(3));
					System.out.println("birthdate :" + m.getDate(4));
					System.out.println("*********************************");
				} while (m.next());
			} else {
				System.out.println("No such user id is already registered");
			}
			conn.close();
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		
		
		return 0;
		
	}
}
