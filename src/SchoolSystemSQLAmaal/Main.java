package SchoolSystemSQLAmaal;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;



public class Main {
static void choicesFunction() {
		
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. connect to database");
		System.out.println("2. create Table Student databse");
		System.out.println("3. create Table Subjects databse");
		System.out.println("4.  Load  1000000 student in Students Table");
		System.out.println("5.  Load 100000 subjects in Subjects Table ");
		System.out.println("6. show top 10000 of student table ");
		System.out.println("7. show top 10000 of subject table ");
		System.out.println("8. add new student ");
		System.out.println("9. add new subject ");
		System.out.println("10. Exit the system ");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		choicesFunction();
		
		do {

			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				ConnectToDatabase connectToDatabse1 = new ConnectToDatabase(); 
				connectToDatabse1.conToData();
				choicesFunction();
//				
				break;
				
			case 2:
				CreatTable createTableStudent = new CreatTable(); 
				createTableStudent.CreateTableToDB();
				choicesFunction();	
				
				break;
				

			case 3:
				CreateTableSubjects createTableSubject = new CreateTableSubjects(); 
				createTableSubject.CreateTableToDB1();
				choicesFunction();
				break;

				

		
				
			case 4:
				InsertDataToStudent InsertStudent = new InsertDataToStudent(); 
				InsertStudent.addFakeStudents();
				choicesFunction();
				
				break;
				
			case 5:
				InsertDataToSubject Insertsubject = new InsertDataToSubject(); 
				Insertsubject.addFakeSubject();
				choicesFunction();
				
				break;
			
			case 6:
				ShowTopStudent topStudent = new ShowTopStudent(); 
				topStudent.ShowTop();
				choicesFunction();
				
				break;
			case 7:
				ShowTopSubject topStubject = new ShowTopSubject(); 
				topStubject.ShowTop();
				choicesFunction();
				
				break;
			case 8:
				addNewStudent addStudent = new addNewStudent(); 
				addStudent.addToStudentTable();
				choicesFunction();
				
				break;
			case 9:
				addNewSubject addSubject = new addNewSubject(); 
				addSubject.addToSubjectTable();
				choicesFunction();
				
				break;
				
			case 10:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);
				
				break;
			
			}

		} while (true);
	}
	

}
