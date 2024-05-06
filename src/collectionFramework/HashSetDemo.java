package collectionFramework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <Integer> hs1 = new HashSet<Integer>();
        hs1.add(100);
        hs1.add(200);

        HashSet <Integer> hs2 = new HashSet<Integer>(hs1);
        hs2.add(300);
        System.out.println(hs2);

    }
}
