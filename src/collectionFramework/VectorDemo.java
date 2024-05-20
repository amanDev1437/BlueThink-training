package collectionFramework;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();

        v1.add("Aman Singh");
        v1.add("Saksham Bhattarai");
        v1.add("Ashish Singh");

        v1.addElement("Ayush Singh");

        System.out.println(v1);
        System.out.println("Default capacity:"+v1.capacity());
        System.out.println("Current size:"+v1.size());
        System.out.println("First Element:"+v1.firstElement());
        System.out.println("Last Element:"+v1.lastElement());
    }


}
