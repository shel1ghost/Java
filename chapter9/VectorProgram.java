import java.util.Vector;

public class VectorProgram{
    public static void main(String[]args){
        Vector<Integer> v1 = new Vector<Integer>();
        //add element
        for(int i=10; i<=20; i++){
            v1.add(i);
        }
        //display
        System.out.println(v1);
        System.out.println("The vector at position 6 is "+v1.get(6));
        //remove
        v1.remove(6);
        System.out.println("After removing element at index 6:");
        System.out.println(v1);
    }
}
