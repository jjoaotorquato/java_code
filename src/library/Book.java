package library;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean avaliable = true;

    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public  boolean isAvaliable(){
        return avaliable;
    }

    public void setAvaliable(boolean avaliable){
        this.avaliable = avaliable;
    }

    @Override
    public String toString(){
        return title+" "+author+" "+year+" "+avaliable+" avaliable";
    }
}