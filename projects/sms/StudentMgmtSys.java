import java.util.Scanner;
import java.lang.*;

class StudentManager{
	static void ViewStudents(){
	}
	static void AddStudent(){
	}
	static void UpdateStudent(){
	}
	static void DeleteStudent(){
	}
}
public class StudentMgmtSys{
	public static void main(String[]args){
		System.out.println("*******************************************");
		System.out.println("*        STUDENT MANAGEMENT SYSTEM        *");
		System.out.println("*******************************************");
		System.out.println("");
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

