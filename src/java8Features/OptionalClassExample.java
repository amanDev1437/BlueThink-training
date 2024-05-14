package java8Features;

import java.util.*;

public class OptionalClassExample {
    public static void main(String[] args) {
        String[] s = new String[10];

        Optional<String> checkNull = Optional.ofNullable(s[5]);

        if(checkNull.isPresent()){
            String lowerCase = s[5].toLowerCase();
            System.out.println(lowerCase);
        }else{
            System.out.println("String not present");
        }

    }
}
