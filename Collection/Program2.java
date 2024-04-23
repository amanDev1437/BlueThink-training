package Collection;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        LinkedList<String> li1 = new LinkedList<String>();
        li1.add("Cow");
        li1.add("Tiger");
        li1.add("Elephant");
        li1.add("Lion");

        LinkedList<String> li2 = new LinkedList<String>();
        li2.addAll(li1);
        li2.add("Bear");

        for (String i : li1) {
            System.out.println(i);

        }
        System.out.println("==============");
        for (String j : li2) {
            System.out.println(j);
        }

    }

}
