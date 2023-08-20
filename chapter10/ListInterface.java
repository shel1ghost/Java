import java.util.*;

public class ListInterface{
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>(); //<Integer> rakhda ni chalxa
        for(int i=10; i<=100; i+=10){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list);

        List<String> strlist = new ArrayList<>();
        strlist.add("Apna Bane Le");
        strlist.add("Malang");
        System.out.println(strlist);

        //adding elements of strlist to strlist2 (new set)
        List<String> strlist2 = new ArrayList<>();
        for(int i=0; i<strlist.size(); i++){
            strlist2.add(strlist.get(i));
        }
        System.out.println(strlist2);
    }
}
