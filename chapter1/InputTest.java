import java.util.Scanner;

public class InputTest{
	public static void main(String[]a){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		System.out.println("The number was "+num);
	}
}

