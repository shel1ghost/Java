import java.io.*;

public class Program02{
    static void number_of_letters(FileInputStream infile, FileOutputStream outfile){
        int c, letters=0;
        try{
            while((c = infile.read()) != -1){
                if(Character.isWhitespace((char)c) == false){
                    letters++;
                }
            }
            outfile.write("Number of letters = ".getBytes());
            outfile.write(String.valueOf(letters).getBytes());
            outfile.write("\n".getBytes());
            infile.close();
            outfile.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    static void digits_chars(FileInputStream infile, FileOutputStream outfile){
        int c, digits=0, chars=0;
        try{
            while((c = infile.read()) != -1){
                if(Character.isDigit((char)c)){
                    digits++;
                }else{
                    chars++;
                }
            }
            outfile.write("Number of digits = ".getBytes());
            outfile.write(String.valueOf(digits).getBytes());
            outfile.write("\n".getBytes());
            outfile.write("Number of other characters = ".getBytes());
            outfile.write(String.valueOf(chars).getBytes());
            outfile.write("\n".getBytes());
            infile.close();
            outfile.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[]args) throws FileNotFoundException{
        FileInputStream file1 = new FileInputStream("testfile.txt");
        FileOutputStream outfile1 = new FileOutputStream("output1.txt");
        number_of_letters(file1, outfile1);
        FileInputStream file2 = new FileInputStream("testfile.txt");
        FileOutputStream outfile2 = new FileOutputStream("output1.txt", true);
        digits_chars(file2, outfile2);
    }
}
