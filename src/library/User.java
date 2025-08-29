package library;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name){
        this.name = name;
    }

    public void borrowedBook(Book book){
        if(book.isAvaliable()) {
            borrowedBooks.add(book);
            book.setAvaliable(false);
            System.out.println("borrowed " + book);
        }else{
            System.out.println("unvaliable");
        }
    }

    public void returnBook(Book book){
        if(borrowedBooks.remove(book)){
            book.setAvaliable(true);
            System.out.println("return "+book);
        }else{
            System.out.println("this book is not borrowed by :"+name);
        }
    }
}
