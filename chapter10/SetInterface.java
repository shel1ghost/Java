import java.util.*;

public class SetInterface{
    public static void main(String[]args){
        Set<Integer> set = new HashSet<>();
        set.add(30);
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println(set);

        //sorting set by passing it to TreeSet
        Set<Integer> sorted_set = new TreeSet<>(set);
        System.out.println("The sorted set is "+sorted_set);

        //in case of string values
        Set<String> strset = new HashSet<>();
        strset.add("Anup");
        strset.add("Preeti");
        strset.add("Anup");
        strset.add("Babi");
        System.out.println(strset);
        //System.out.println(strset.get(0)); invalid operation.. get xaina yesma

    }
}
