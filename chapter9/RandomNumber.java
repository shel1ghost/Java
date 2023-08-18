import java.util.*;

public class RandomNumber{
    public static void main(String[]args){
        Random num = new Random();
        for(int i=1; i<=10; i++){
            int random_num = num.nextInt(1, 100);
            System.out.println(random_num);
        }
    }
}
