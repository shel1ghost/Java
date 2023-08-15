import java.util.Scanner;

public class Largest7{
	public static void main(String[]args){
		int a, b, c, d, largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if(a>b && a>c && a>d){
			largest = a;
		}else if(b>a && b>c && b>d){
			largest = b;
		}else if(c>a && c>b && c>d){
			largest = c;
		}else{
			largest = d;
		}
		System.out.println("The largest number is "+largest);
	}
}

