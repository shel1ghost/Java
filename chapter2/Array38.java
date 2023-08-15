import java.util.Scanner;

public class Array38{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[2][2];
		int transpose[][] = new int[2][2];
		System.out.println("Enter the matrix elements (2x2):");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				transpose[i][j] = mat[j][i];
			}
		}
		System.out.println("The transpose is:");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
