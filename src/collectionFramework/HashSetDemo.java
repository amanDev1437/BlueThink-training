package collectionFramework;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <Integer> hs1 = new HashSet<Integer>();
        hs1.add(100);
        hs1.add(200);
        hs1.add(1000);

        HashSet <Integer> hs2 = new HashSet<Integer>(hs1);
        hs2.add(300);
        System.out.println(hs2);

        for(Integer i : hs2){
            System.out.println(i);
        }

       TreeSet t1 = new TreeSet(hs2);
        System.out.println(t1);
    }
}
