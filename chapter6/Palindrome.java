import java.util.Scanner;

public class Palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuffer str = new StringBuffer(sc.next());
        String str1 = str.toString();
        str.reverse();
        String str2 = str.toString();
        if(str1.equals(str2)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }
    }
}
