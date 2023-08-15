import java.util.Scanner;

public class Discount4{
	public static void main(String[]args){
		float amount, discount=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		amount = sc.nextFloat();
		if(amount >= 5000){
			discount=0.1F*amount;
		}else if(amount >= 4000){
			discount=0.07F*amount;
		}else if(amount >= 3000){
			discount=0.05F*amount;
		}else if(amount >= 2000){
			discount=0.03F*amount;
		}else{
			discount=0.02F*amount;
		}
		System.out.println("The discount is "+discount);
	}
}
			
