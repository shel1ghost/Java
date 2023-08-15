import java.util.Scanner;

public class Array35{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int mat1[][] = new int[2][2];
		int mat2[][] = new int[2][2];
		int sum[][] = new int[2][2];
		System.out.println("Enter the elements of first matrix (2x2):");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				mat1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the elements of second matrix (2x2):");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				mat2[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				sum[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("The sum is:");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(sum[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
