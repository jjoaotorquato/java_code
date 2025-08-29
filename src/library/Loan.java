package library;

import java.time.LocalDate;

public class Loan {
    private User user;
    private Book book;
    private LocalDate date;

    public Loan(User user, Book book, LocalDate date){
        this.user = user;
        this.book = book;
        this.date = LocalDate.now();
    }

    @Override
    public String toString(){
        return user+" take"+book+" "+date+" in ";
    }
}
