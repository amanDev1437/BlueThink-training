package collectionFramework;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.push(100);
        ad1.push(200);
        ad1.push(300);

        System.out.println(ad1.peek());
        ad1.offer(500);
        System.out.println(ad1);
        ad1.pop();
        System.out.println(ad1);
        ad1.push(1000);
        System.out.println(ad1);
        ad1.remove();
        System.out.println(ad1);
        ad1.removeLast();
        System.out.println(ad1);
    }
}
