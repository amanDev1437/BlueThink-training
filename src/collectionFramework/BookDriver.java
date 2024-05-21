package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class BookDriver {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Learn java","Aman Singh",101));
        bookList.add(new Book("Learn python","Prabhakar Singh",110));
        bookList.add(new Book("Learn C++","Saksham",105));
        bookList.add(new Book("Learn javascript","Divakar Singh",112));

        System.out.println("Before sorting");

        bookList.forEach(book -> System.out.println(book.bookID+" "+book.bookName+" "+book.author));

        Collections.sort(bookList, new SortByBookID());

        System.out.println("After Sorting");

        bookList.forEach(book -> System.out.println(book.bookID+" "+book.bookName+" "+book.author));

        System.out.println("Sorted By Book Name");

        Collections.sort(bookList,new SortByBookID());

        bookList.forEach(book -> System.out.println(book.bookID+" "+book.bookName+" "+book.author));

        Collections.sort(bookList,new SortedByBookName());

        System.out.println("Sorted by book name");

        bookList.forEach(book -> System.out.println(book.bookID+" "+book.bookName+" "+book.author));

    }
}
