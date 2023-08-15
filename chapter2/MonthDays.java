import java.util.Scanner;

public class MonthDays{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month number: ");
		byte mon = sc.nextByte();
		switch(mon){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days!");
					break;
			case 2:
				System.out.println("29 days!");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 days!");
				break;
			default:
				System.out.println("Invalid month!");
		}
	}
}

