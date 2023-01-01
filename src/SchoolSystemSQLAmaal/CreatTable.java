package SchoolSystemSQLAmaal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatTable {
	static final String DB_URL = "jdbc:mysql://localhost:3306/SchoolMgt";
	   static final String USER = "root";
	   static final String PASS = "root";
	public boolean CreateTableToDB () {
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		          String sql = "CREATE TABLE Students " +
		                   "(id INTEGER not NULL, " +
		                   " fname VARCHAR(100), " + 
		                   " lname VARCHAR(100), " + 
		                   " birthdate Date, " + 
		                   " PRIMARY KEY ( id ))"; 

		         stmt.executeUpdate(sql);
		         
		         System.out.println(true+"===>Created table in given database...");   
		        
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		return false; 
		   }
	}

