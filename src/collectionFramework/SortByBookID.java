package collectionFramework;

import java.util.*;

public class SortByBookID implements Comparator<Book> {

    public int compare(Book b1, Book b2){
        return b1.bookID - b2.bookID;
    }
}
