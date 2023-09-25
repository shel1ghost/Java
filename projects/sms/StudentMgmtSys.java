import java.util.Scanner;
import java.lang.*;
import java.sql.*;

class StudentManager{
	static void ViewStudents(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			Statement stmt = conn.createStatement();
			String sqlStmt = "SELECT * FROM students;";
			ResultSet rs = stmt.executeQuery(sqlStmt);
			System.out.println("------------------------------------------------------------");
			System.out.println("| S.No | Name               | Roll No | Address            |");
			System.out.println("------------------------------------------------------------");
			while(rs.next()){
				System.out.printf("| %-4s | %-18s | %-7s | %-18s |", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                System.out.println("");
			}
            System.out.println("------------------------------------------------------------");
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception err){
			System.out.println("Error: "+err);
		}
	}
	static void AddStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String sname = sc.nextLine();
		System.out.print("Enter roll number: ");
		String roll_no = sc.nextLine();
		System.out.print("Enter address: ");
		String address = sc.nextLine();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			Statement stmt = conn.createStatement();
            String sqlStmt = "INSERT INTO students VALUES("+roll_no+","+"'"+sname+"'"+","+roll_no+","+"'"+address+"'"+");";
            stmt.executeUpdate(sqlStmt);
			System.out.println("Student added successfully!");
			stmt.close();
			conn.close();
		}catch(Exception err){
			System.out.println(err);
		}
	}
	static void UpdateStudent(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			Statement stmt = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the student roll number: ");
			String roll_no = sc.nextLine();
			System.out.println("1. Edit Name");
			System.out.println("2. Edit Address");
			System.out.print("Select an option: ");
			String choice = sc.nextLine();
			if(choice.equals("1")){
				System.out.print("Enter new name: ");
				String sname = sc.nextLine(); 
				String sqlStmt = "UPDATE students SET sname="+"'"+sname+"'"+"WHERE roll_no="+roll_no+";";
				stmt.executeUpdate(sqlStmt);
				System.out.println("Name updated successfully!");
			}else if(choice.equals("2")){
				System.out.print("Enter new address: ");
				String address = sc.nextLine();
				String sqlStmt = "UPDATE students SET address="+"'"+address+"'"+"WHERE roll_no="+roll_no+";";
				stmt.executeUpdate(sqlStmt);
				System.out.println("Address updated successfully!");
			}else{
				System.out.println("Invalid choice!");
			}
			stmt.close();
			conn.close();
		}catch(Exception err){
			System.out.println("Error: "+err);
		}

	}
	static void DeleteStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the student roll number: ");
		String roll_no = sc.nextLine();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			Statement stmt = conn.createStatement();
			String sqlStmt = "DELETE FROM students WHERE roll_no="+roll_no;
			stmt.executeUpdate(sqlStmt);
			System.out.println("Student deleted successfully!");
			stmt.close();
			conn.close();
		}catch(Exception err){
			System.out.println("Error: "+err);
		}
	}
}
public class StudentMgmtSys{
	public static void main(String[]args){
		System.out.println("*******************************************");
		System.out.println("*        STUDENT MANAGEMENT SYSTEM        *");
		System.out.println("*******************************************");
		System.out.println("");
		while(true){
			System.out.println("1. View students");
			System.out.println("2. Add student");
			System.out.println("3. Update student details");
			System.out.println("4. Delete student");
			System.out.println("5. Exit");
			System.out.println("");
			System.out.print("Enter your choice: ");

			Scanner sc = new Scanner(System.in);
			StudentManager sm = new StudentManager();

			String choice = sc.next();
		
			switch(choice){
				case "1":
					sm.ViewStudents();
					break;
				case "2":
					sm.AddStudent();
					break;
				case "3":
					sm.UpdateStudent();
					break;
				case "4":
					sm.DeleteStudent();
					break;
				case "5":
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice!");
					break;
			}
		}
	}
}

