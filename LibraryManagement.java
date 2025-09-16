package day3;

import java.util.*;

class Book {
    private int bookId;
    private String bookName, authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName; 
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Author: " + authorName;
    }
}

class Library {
    private List<Book> list = new ArrayList<>(); 
    private Set<Book> set = new HashSet<>();    
    private Map<Integer, Book> map = new HashMap<>(); 

    public void addBook(Book book) {
        list.add(book);
        set.add(book);
        map.put(book.getBookId(), book); 
        System.out.println("Book \"" + book.getBookName() + "\" is added");
    }

    public void listBooks() {
        System.out.println("\n____Books listed using List____");
        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println("\n____Books listed using Set____");
        for (Book book : set) {
            System.out.println(book);
        }

        System.out.println("\n____Books listed using Map____");
        for (Integer key : map.keySet()) {
            System.out.println(  map.get(key));
        }
    }

    public void findBookById(int id) {
        Book book = map.get(id);
        if (book != null)
            System.out.println("\nBook Found: " + book);
        else
            System.out.println("Book not found with ID: " + id);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b = new Book(1, "Book1", "Author1");
        Book b1 = new Book(2, "Book2", "Author2");

        Library lib = new Library();
        lib.addBook(b);
        lib.addBook(b1);

        lib.listBooks();
        lib.findBookById(1);
        lib.findBookById(3); 
    }
}