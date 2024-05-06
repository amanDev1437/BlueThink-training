package collectionFramework;

import java.util.*;

public class ListDemo{
    public static void main(String[] args) {
        List <String> l1 = new ArrayList<String>();

        l1.add("Mango");
        l1.add("Apple");
        l1.add("Oranges");
        l1.add("Grapes");

        List <String> l2 = new ArrayList<String>();
        l2.addAll(l1);
        l2.add("Kiwi");

        System.out.println("Fruits of L1");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("Fruits of L2");
        for(String fruit: l2){
            System.out.println(fruit);
        }

        System.out.println(l1.indexOf("Oranges"));


    }
}


