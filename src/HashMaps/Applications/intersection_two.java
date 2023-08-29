package Applications;

import java.util.*;

public class intersection_two {
    public static void main(String[] args) {
        int a1[]={7,3,9};
        int a2[]={6,3,9,2,9,4};

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for (int i=0;i<a1.length;i++) {
            set.add(a1[i]);
        }

        int c=0;

        for (int i=0;i<a2.length;i++) {
            if (set.contains(a2[i])) {
                c++;
                set2.add(a2[i]);
            }
        }

        System.out.println(c+" "+set2);
    }
}