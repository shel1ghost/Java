import java.util.Scanner;

public class Menu30{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1. To find area of circle");
		System.out.println("2. To check odd or even");
		System.out.println("3. Find sum of n numbers");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		int c = sc.nextInt();
		switch(c){
			case 1:
				System.out.print("Enter the radius: ");

				float r= sc.nextFloat();
				float area = 3.14f*r*r;
				System.out.println("The area is "+area);
				break;
			case 2:
				System.out.print("Enter a number: ");
				int num = sc.nextInt();
				if(num%2==0){
					System.out.println("The number is even");
				}else{
					System.out.println("The number is odd");
				}
				break;
			case 3:
				System.out.print("Enter how many numbers: ");
				int n = sc.nextInt();
				System.out.println("Enter "+n+" numbers");
				int sum = 0;
				for(int i=1; i<=n; i++){
					int x = sc.nextInt();
					sum += x;
				}
				System.out.println("The sum is "+sum);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!");
		}
	}
}
				
