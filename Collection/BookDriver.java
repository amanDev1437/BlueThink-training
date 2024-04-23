package Collection;

import java.util.*;

public class BookDriver {
    public static void main(String[] args) {
        List<Book> list1 = new ArrayList<Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant", "BPB", 8);
        Book b2 = new Book(102, "Let us java", "Yashwant", "BPB", 10);

        list1.add(b1);
        list1.add(b2);
        for (Book b : list1) {
            System.out.println(b.id);
            System.out.println(b.name);
            System.out.println(b.author);
            System.out.println(b.publisher);
            System.out.println(b.quantity);

        }
    }

}
