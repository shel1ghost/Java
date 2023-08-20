import java.util.*;

public class Array_List{
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Babi");
        arr.add("Astra");
        arr.add("Anup");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.get(0));

        //SORTING USING COLLECTIONS
        System.out.println("After sorting with collections: ");
        Collections.sort(arr);
        System.out.println(arr);
    }
}
