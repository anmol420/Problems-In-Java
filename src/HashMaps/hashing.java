import java.util.*;

class hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        //inserting
        map.put("India", 150);
        map.put("USA", 30);
        map.put("China", 160);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);

        //searching
        if(map.containsKey("China")) {
            System.out.println("Exist");
        } else {
            System.out.println("DoNot Exist");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //removing a pair
        map.remove("China");
        System.out.println(map);
    }
}
