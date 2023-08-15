import java.util.Scanner;

public class Reverse24{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int num = sc.nextInt();
		int mod, rev=0;
		while(num !=0){
			mod = num%10;
			rev = (rev*10)+mod;
			num/=10;
		}
		System.out.println("The reverse is "+rev);
	}
}


