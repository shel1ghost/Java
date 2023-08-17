import java.io.*;
import java.util.Scanner;

public class Program03{
    public static void main(String[]args) throws FileNotFoundException{
        FileInputStream infile = new FileInputStream("numbers.txt");
        FileOutputStream outfile = new FileOutputStream("output2.txt");
        int sum=0;
        float avg, n=0;
        Scanner sc = new Scanner(infile);
        try{
            while(sc.hasNextInt()){
                sum+=sc.nextInt();
                n++;
            }
            avg = sum/n;
            outfile.write("Sum = ".getBytes());
            outfile.write(String.valueOf(sum).getBytes());
            outfile.write("\n".getBytes());
            outfile.write("Average = ".getBytes());
            outfile.write(String.valueOf(avg).getBytes());
            outfile.write("\n".getBytes());
            infile.close();
            outfile.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
