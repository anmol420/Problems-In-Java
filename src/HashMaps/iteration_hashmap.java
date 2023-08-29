import java.util.*;

public class iteration_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("USA", 30);
        map.put("China", 160);

        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //for printing only the keys
        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println(key+" "+map.get(key));
        }
    }
}
