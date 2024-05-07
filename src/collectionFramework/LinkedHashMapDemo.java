package collectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap <Integer, String> l1 = new LinkedHashMap<>();

        l1.put(101,"aman");
        l1.put(102,"saksham");
        l1.put(103,"ashish");

        System.out.println(l1.get(103));
        l1.remove(101);
        System.out.println(l1);
    }
}
