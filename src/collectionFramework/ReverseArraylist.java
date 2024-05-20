package collectionFramework;

import java.util.*;

public class ReverseArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(30);
        list.add(10);
        list.add(20);

        for(Integer i:list){
            System.out.println(i);
        }

        System.out.println("After Reverse:");

        Collections.reverse(list);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
