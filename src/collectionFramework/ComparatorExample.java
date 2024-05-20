package collectionFramework;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aman");
        list.add("Saksham");
        list.add("Ashish");
        list.add("Ayush");

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                if(s1.length() > s2.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(list,com);
        System.out.println(list);
    }

}
