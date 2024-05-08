package java8Features;

import java.util.*;

public class StringJoinerExample {
    public static void main(String[] args) {

        StringJoiner joinName = new StringJoiner(",", "[","]");

        joinName.add("Aman");
        joinName.add("Ashish");
        joinName.add("Saksham");

        System.out.println(joinName);



    }
}
