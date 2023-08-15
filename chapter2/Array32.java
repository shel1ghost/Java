import java.util.Scanner;

public class Array32{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 20 students:");
		float marks[] = new float[20];
		int a=0, b=0, c=0, d=0;
		for(int i=0; i<marks.length; i++){
			marks[i] = sc.nextFloat();
		}
		for(int i=0; i<marks.length; i++){
			if(marks[i] >= 81 && marks[i] <=100){
				a++;
			}else if(marks[i] >= 61 && marks[i] <= 80){
				b++;
			}else if(marks[i] >= 41 && marks[i] <=60){
				c++;
			}else{
				d++;
			}
		}
		System.out.println("81-100 = "+a+" students");
		System.out.println("61-80 = "+b+" students");
		System.out.println("41-60 = "+c+" students");
		System.out.println("0-40 = "+d+" students");

	}
}
