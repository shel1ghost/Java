import java.util.*;

public class MapInterface{
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Astra");
        map.put(2, "Shellghost");
        map.put(3, "Miss Programmer");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());
        map.remove(2); //key i.e 2
        System.out.println(map);
    }
}
