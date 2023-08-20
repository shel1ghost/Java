import java.util.*;

public class Tree_Set{
    public static void main(String[]args){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Babi");
        ts.add("Anup");
        ts.add("Hira");
        System.out.println(ts);
        ts.remove("Hira");
        System.out.println(ts);
        System.out.println(ts.contains("Anup"));
        //System.out.println(ts.get(1)); NOT ALLOWED
        System.out.println(ts.size()); //2

        //TRAVERSING ELEMENTS
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
