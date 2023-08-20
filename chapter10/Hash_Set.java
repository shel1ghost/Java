import java.util.*;

public class Hash_Set{
    public static void main(String[]args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Babi");
        hs.add("Anup");
        hs.add("Hira");
        System.out.println(hs);
        hs.remove("Hira");
        System.out.println(hs);
        System.out.println(hs.contains("Anup"));
        System.out.println(hs.size()); //2
        //yesma ni hs.get() not allowed
    }
}
