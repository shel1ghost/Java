import java.util.Scanner;

public class Array37{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[4][4];
		int r1=0, r2=0, r3=0, r4=0;
		System.out.println("Enter the 4x4 matrix elements:");
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<4; i++){
			r1+=mat[0][i];
			r2+=mat[1][i];
			r3+=mat[2][i];
			r4+=mat[3][i];
		}
		System.out.println("The sum of first row = "+r1);
		System.out.println("The sum of second row = "+r2);
		System.out.println("The sum of third row = "+r3);
		System.out.println("The sum of fourth row = "+r4);
	}
}

