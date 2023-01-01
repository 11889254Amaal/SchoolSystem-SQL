package SchoolSystemSQLAmaal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class addNewStudent {
	public static void addToStudentTable() throws ClassNotFoundException, SQLException, ParseException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			// System.out.println("Database Connected successfully");

			// Entering the data
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter id");
			int id = scanner.nextInt();

			System.out.println("enter fname");
			String fname = scanner.next();

			System.out.println("enter lname");
			String lname = scanner.next();
			
			System.out.println("enter birthdate");
			String birthdate = scanner.next();
			
		
			// Inserting data using SQL query
			String sql = "INSERT INTO Students VALUES(" + id + ",'" + fname + "','" + lname + "','"
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
			con.close();

		} else {
			System.out.println("Database Connection failed");
		}
	}

	private static String STR_TO_DATE(String birthdate, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
