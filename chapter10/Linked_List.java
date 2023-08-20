import java.util.*;

public class Linked_List{
    public static void main(String[]args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
        System.out.println(ll.get(0));
    }
}
