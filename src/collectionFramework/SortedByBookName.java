package collectionFramework;

import java.util.Comparator;

public class SortedByBookName implements Comparator<Book> {

    public int compare(Book b1, Book b2){
        return b1.bookName.compareTo(b2.bookName);
    }
}
