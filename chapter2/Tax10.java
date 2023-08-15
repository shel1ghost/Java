import java.util.Scanner;

public class Tax10{
	public static void main(String[]args){
		float income, salary;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you income: ");
		income = sc.nextFloat();
		if(income < 10000){
			salary = income;
		}else if(income >= 10000 && income <= 19999){
			salary = income-(0.1F*income);
		}else if(income >= 20000 && income <= 39999){
			salary = income-(0.15F*income);
		}else{
			salary = income-(0.2F*income);
		}
		System.out.println("The net salary is "+salary);
	}
}
