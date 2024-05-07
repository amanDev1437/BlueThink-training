package collectionFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();

        l1.add(100);
        l1.add(200);
        System.out.println(l1);

        Iterator<Integer> i = l1.iterator();

        while (i.hasNext()){
            Integer n = i.next();

            System.out.println(n);
        }
        Collections.reverse(l1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int n = sc.nextInt();
        int index = Collections.binarySearch(l1,n);
        if(index>=0){
            System.out.println("Elements found at index:"+index);
        }else{
            System.out.println("Elements not found");
        }
    }
}
