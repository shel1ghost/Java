import java.util.Scanner;

public class Recursive11{
    public static void fibonacci(int n){
        int a=0, b=1, c=0;
        for(int i=1; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+"\t");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
