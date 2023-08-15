import java.util.Scanner;

public class NaturalNum{
	public static void main(String[]args){
		System.out.print("Enter a natural number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, prod=1;
		float avg = 0;
		for(int i=1; i<=n; i++){
			System.out.println(i);
			sum+=i;
			prod*=i;
		}
		avg = sum/2;
		System.out.println("The sum is "+sum+", the product is "+prod+", the average is "+avg);
	}
}
