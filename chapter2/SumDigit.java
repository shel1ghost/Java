import java.util.Scanner;

public class SumDigit{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		int sum=0, mod=0;
		while(num !=0){
			mod = num%10;
			sum += mod;
			num/=10;
		}
		System.out.println("The sum is "+sum);
	}
}
