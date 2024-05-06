package collectionFramework;

import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();

        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);

        for(Integer num:a1){
            System.out.println(num);
        }
        System.out.println(a1.get(2));
        a1.set(1,1000);
        System.out.println(a1);

        Collections.sort(a1);
        Iterator<Integer> it = a1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
