import java.io.*;

public class Program01{
    static int number_of_chars(FileInputStream file){
        int count = 0, c=0;
        try{
            while((c = file.read()) != -1){
                count++;
                c++;
            }
            file.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return count;
    }

    static void vowels_consonants(FileInputStream file){
        int c, vowels=0, consonants=0;
        try{
            while((c = file.read()) != -1){
                if((char)c == 'a' || (char)c == 'e' || (char)c == 'i' || (char)c == 'o' || (char)c == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
            System.out.println("Number of vowels = "+vowels);
            System.out.println("Number of consonants = "+consonants);
            file.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    static int number_of_words(FileInputStream file){
        int c, words=0;
        try{
            while((c = file.read()) != -1){
                if(Character.isWhitespace((char)c)){
                    words++;
                }
            }
            file.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return words;
    }

    static int number_of_lines(FileInputStream file){
        int c, lines=0;
        try{
            while((c = file.read()) != -1){
                if((char)c == '\n'){
                    lines++;
                }
            }
            file.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return lines;
    }

    public static void main(String[]args) throws FileNotFoundException{
        FileInputStream file = new FileInputStream("testfile.txt");
        int chars = number_of_chars(file);
        System.out.println("Number of characters = "+chars);
        FileInputStream file2 = new FileInputStream("testfile.txt");
        vowels_consonants(file2);
        FileInputStream file3 = new FileInputStream("testfile.txt");
        int lines = number_of_lines(file3);
        System.out.println("Number of lines = "+lines);
        FileInputStream file4 = new FileInputStream("testfile.txt");
        int words = number_of_words(file4);
        System.out.println("Number of words = "+words);
    }
}
