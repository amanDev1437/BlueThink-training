package Collection;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Oranges");

        System.out.println(list.get(2));
        list.set(2, "Kiwi");
        System.out.println(list);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(9);
        list2.add(2);
        list2.add(5);
        list2.add(7);
        Collections.sort(list2);
        for (Integer i : list2) {
            System.out.println(i);

        }
    }

}
