package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();

        p1.add("Aman");
        p1.add("Saksham");
        p1.add("Ashish");

        System.out.println(p1.element());

        for(String s:p1){
            System.out.println(s);
        }

        p1.remove("Saksham");
        System.out.println(p1);
    }
}
