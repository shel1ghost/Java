import java.util.Scanner;

public class Depriciation{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the depriciation amount, purchase price and years of service: ");
		float depr = sc.nextFloat();
		float purc = sc.nextFloat();
		float years = sc.nextFloat();
		float salvage = 0;
		salvage = purc-(years*depr);
		System.out.println("The salvage value is "+salvage);
	}
}
