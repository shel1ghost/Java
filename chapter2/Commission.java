import java.util.Scanner;

public class Commission{
	public static void main(String[]args){
		float sales, com;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your monthly sales: ");
		sales = sc.nextFloat();
		if(sales < 10000){
			com = 0.05f*sales;
		}else{
			com = 0.1f*sales;
		}
		System.out.println("Your commission is "+com);
	}
}

