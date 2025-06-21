package Praktikum15;

public class Book {
    public String isbn;
    public String title;

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + " Tittle: " + this.title;
    }
}