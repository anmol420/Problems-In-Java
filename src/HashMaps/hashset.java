import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //set only stores unique values

        //search
        if (set.contains(1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //delete
        set.remove(1);

        //size
        System.out.println(set.size());

        //iterator
        Iterator it=set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
