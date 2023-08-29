package Applications;

import java.util.*;

public class union_two {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        int a1[]={7,3,9};
        int a2[]={6,3,9,6,2,4};

        for (int i=0;i<a1.length;i++) {
            set.add(a1[i]);
        }
        for (int i=0;i<a2.length;i++) {
            set.add(a2[i]);
        }

        System.out.println(set.size()+" "+set);
    }
}
