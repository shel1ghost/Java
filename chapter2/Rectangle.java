import java.util.Scanner;

public class Rectangle{
	public static void main(String[]args){
		float l, b, a, p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		l = sc.nextFloat();
		System.out.print("Entert the breadth of rectangle: ");
		b = sc.nextFloat();
		a = l*b;
		p = 2*(l+b);
		System.out.println("The area is "+a+" and the perimeter is "+p);
	}
}
		
