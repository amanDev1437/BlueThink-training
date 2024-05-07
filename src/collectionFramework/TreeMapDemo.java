package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<>();

        t1.put(101,"Java");
        t1.put(102,"c++");
        t1.put(103,"javascript");

        for(Map.Entry<Integer, String> m: t1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
