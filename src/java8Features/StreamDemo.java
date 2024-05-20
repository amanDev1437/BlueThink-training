package java8Features;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(10,20,60,90,56,21);

        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0).map(n->n*2);
        int result = s2.reduce(0,(c,e)->c+e);
        System.out.println(result);


        s2.forEach(element-> System.out.println(element));

    }
}
