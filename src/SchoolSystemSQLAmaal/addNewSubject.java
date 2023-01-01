package SchoolSystemSQLAmaal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class addNewSubject {
    public static void addToSubjectTable () throws SQLException, ClassNotFoundException {
    	Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("==============================");
            
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter id");
			int id = scanner.nextInt();
			
			System.out.println("enter title");
			String title = scanner.next();

			System.out.println("enter description");
			String description = scanner.next();
			
			System.out.println("enter price");
			int pricePerStudent = scanner.nextInt();
			////////////////////////////////////////////
		


				// Inserting data using SQL query
				String sql = "INSERT INTO Subjects VALUES(" + id + ",'" + title  + "','" + description  + "','"
						+ pricePerStudent + "')";
				Statement st = con.createStatement();
				//
				// Executing query
				int m = st.executeUpdate(sql);
				if (m >= 1)
					System.out.println("inserted successfully : " + sql);
				else
					System.out.println("insertion failed");

				// Closing the connections
				con.close();


			}
		

		}
	
	
}
