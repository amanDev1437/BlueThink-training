package collectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<Integer>();

        s1.push(100);
        s1.push(200);
        s1.push(2300);

        System.out.println("Found at index:"+s1.search(200));
        s1.pop();
        System.out.println(s1.peek());

        System.out.println(s1.empty());

    }
}
