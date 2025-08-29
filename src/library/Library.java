package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("book add "+book);
    }

    public void listBook(){
        System.out.println("books");
        for(Book b : books){
            System.out.println(b);
        }
    }
}
