package SchoolSystemSQLAmaal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InsertDataToSubject {
	public long addFakeSubject() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("==============================");

			//////////////////////////////////////////////////////////
			System.out.println("PlZ enter number of subject");
			Scanner sc = new Scanner(System.in); // System.in is a standard input stream
			long count = sc.nextLong(); // reads string

			int int_random = ThreadLocalRandom.current().nextInt();
			///////////////////////////////////////////////////
			
			String title = "java";

			
			String description = "I love Java";
			
			
			Integer pricePerStudent = 250;
			////////////////////////////////////////////
		
			////////////////////////////////////////////////////

			///////////////////////////////////////////
			for (long id = 1; id <= count; id++) {
				// String id2=id1+" "+int_random;
				// long id = Integer.parseInt(id2);
//  			System.out.println(id);
				// Inserting data using SQL query
				System.out.println(id);

				// Inserting data using SQL query
				String sql = "INSERT INTO Subjects VALUES(" + id + ",'" + (title + id) + "','" + (description + id) + "','"
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
			

			}
			con.close();

		}
		return 0;
	}
}
