import java.util.Scanner;

public class Purchase2{
	public static void main(String[]args){
		float amount, discount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		amount = sc.nextFloat();
		if(amount >= 1000){
			discount = 0.05F*amount;
			System.out.println("The discount is "+discount);
		}else{
			System.out.println("Sorry no discount :(");
		}
	}
}

