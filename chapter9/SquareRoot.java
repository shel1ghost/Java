import java.util.Scanner;
import java.lang.Math;

public class SquareRoot{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double square_root = Math.sqrt(num);
        System.out.println("The square root is "+square_root);

    }
}
