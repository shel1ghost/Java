import java.util.Scanner;

public class Array36{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int sum = 0;
		System.out.println("Enter the elements of 3x3 matrix:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				sum+=mat[i][j];
			}
		}
		System.out.println("The sum of total elements in the matrix is "+sum);
	}
}
