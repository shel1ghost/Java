import java.util.Scanner;

public class Recursive10{
    public static int sum(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            result+=i;
        }
        return result;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        int sum = sum(num);
        System.out.println("The sum is "+sum);
    }
}
