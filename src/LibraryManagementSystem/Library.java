package LibraryManagementSystem;

import java.util.*;

public class Library {

    HashMap <Integer, Book> books = new HashMap<>();

    public void addBook(Book b){
        books.put(b.bookId, b);
        System.out.println("Book added with bookId:"+b.bookId);
    }

    public Book findBook(int bookId){
        return books.get(bookId);
    }

    public static void main(String[] args) {

        Library l1 = new Library();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bookId");
        int bookId = sc.nextInt();

        System.out.println("Enter title of book");
        String bookTitle = sc.next();

        Book b = new Book(bookId,bookTitle);
        l1.addBook(b);

        System.out.println("Enter the bookId");
        int n = sc.nextInt();

        System.out.println(l1.findBook(n).bookTitle);

    }
}
