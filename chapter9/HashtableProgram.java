import java.util.Hashtable;

public class HashtableProgram{
    public static void main(String[]args){
        Hashtable <Integer, String> student = new Hashtable<Integer, String>();
        //adding element pair to Hashtable
        student.put(1, "Aaditya Khatri");
        student.put(2, "Aisha Joshi");
        student.put(3, "Ashmita Lamichhane");
        student.put(4, "Babi Thakur");
        //print info of student 1
        System.out.println(student.get(1));
    }
}
