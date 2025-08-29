package library;

public class Main {
    public static void main(String[] args){

        Library library = new Library();
        Book book1 = new Book("senhor dos aneis","tolkien",1954);
        library.addBook(book1);

        User user1 = new User("joao");
        library.listBook();
        user1.borrowedBook(book1);
        library.listBook();
        user1.returnBook(book1);
        library.listBook();
    }
}
