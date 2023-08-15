import java.util.Scanner;

public class Grade12{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		char g = sc.next().charAt(0);
		switch(g){
			case 'A':
				System.out.println("EXCELLENT");
				break;
			case 'B':
				System.out.println("VERY GOOD");
				break;
			case 'C':
				System.out.println("GOOD");
				break;
			case 'D':
				System.out.println("SATISFACTORY");
				break;
			case 'E':
				System.out.println("FAIL");
				break;
			default:
				System.out.println("INVALID");
		}
	}
}
