package java8Features;

public class Read {
    public static void main(String[] args) {

        Readable r1 = (name) -> ("i am reading book:"+name);

        System.out.println(r1.read("Concepts of Physics"));
    }

}
