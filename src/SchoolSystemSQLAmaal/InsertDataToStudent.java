package SchoolSystemSQLAmaal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class InsertDataToStudent {
	public long addFakeStudents() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("==============================");

			//////////////////////////////////////////////////////////
			System.out.println("PlZ enter number of student");
			Scanner sc = new Scanner(System.in); // System.in is a standard input stream
			long count = sc.nextLong(); // reads string

			int int_random = ThreadLocalRandom.current().nextInt();
			///////////////////////////////////////////////////
			
			String fname = "Amaal";

			
			String lname = "Ali";
			////////////////////////////////////////////
			Random random = new Random();
			int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
			int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
			long randomDay = minDay + random.nextInt(maxDay - minDay);
			LocalDate birthdate = LocalDate.ofEpochDay(randomDay);
			////////////////////////////////////////////////////

			///////////////////////////////////////////
			for (long id = 1; id <= count; id++) {
				// String id2=id1+" "+int_random;
				// long id = Integer.parseInt(id2);
//  			System.out.println(id);
				// Inserting data using SQL query
				System.out.println(id);

				// Inserting data using SQL query
				String sql = "INSERT INTO Students VALUES(" + id + ",'" + (fname + id) + "','" + (lname + id) + "','"
						+ birthdate + "')";
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
