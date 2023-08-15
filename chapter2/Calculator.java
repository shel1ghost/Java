import java.util.Scanner;

public class Calculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.print("Enter the operation(+,-,*,/,%): ");
		char op = sc.next().charAt(0);
		float result;
		switch(op){
			case '+':
				result = a+b;
				System.out.println("The result is "+result);
				break;
			case '-':
				result = a-b;
				System.out.println("The result is "+result);
				break;
			case '*':
				result = a*b;
				System.out.println("The result is "+result);
				break;
			case '/':
				result = a/b;
				System.out.println("The result is "+result);
				break;
			case '%':
				result = a%b;
				System.out.println("The result is "+result);
				break;
			default:
				System.out.println("Invalid Operation!");
		}
	}
}
