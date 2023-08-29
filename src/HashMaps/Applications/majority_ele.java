package Applications;

import java.util.*;

class majority_ele {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();

        int n[]={1,2};
        int c=1;

        for (int i=0;i<n.length;i++) {
            if(map.containsKey(n[i])) {
                c=map.get(n[i])+1;
                map.put(n[i],c);
            } else {
                map.put(n[i], c);
            }
            c=1;
        }

        for (int key: map.keySet()) {
            if (map.get(key)>(n.length/3)) {
                System.out.println(key);
            }
        }

    }
}
