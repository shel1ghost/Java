import java.util.Scanner;

public class Quiz{
    static void printOptions(String option[]){
        for(int i=0; i<option.length; i++){
            System.out.println(i+1+". "+option[i]);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String opt[] = {"Matsaya", "Parshuram", "Ram", "Kalki"};
        System.out.println("\nWho is the 6th avatar of lord bishnu?");
        printOptions(opt);
        int ans = sc.nextInt();
        if(ans == 2){
            System.out.println("Correct answer, congrats!");
        }else{
            System.out.println("Oops, wrong answer! The right answer is Parshuram.");
        }
    }
}
