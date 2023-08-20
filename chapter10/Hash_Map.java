import java.util.*;

public class Hash_Map{
    public static void main(String[]args){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Aaditya Khatri");
        hm.put(2, "Aisha Joshi");
        System.out.println(hm);
        System.out.println("The size is "+hm.size());
        hm.remove(2); //removes Aisha Joshi
        System.out.println(hm.get(1)); //prints Aaditya Khatri
        System.out.println(hm.containsKey(1)); //true
        System.out.println(hm.containsKey(10)); //false
        hm.clear();
        System.out.println("After clearing HashMap: ");
        System.out.println(hm);
    }
}
