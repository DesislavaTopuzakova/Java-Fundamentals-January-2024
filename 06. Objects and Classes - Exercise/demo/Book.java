package demo;

public class Book {

    // 1. Fields
    private String title;
    private String author;
    private double price;

    // 2. Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 3. Methods
    public void sell() {
        System.out.printf("Book with title: %s was successfully sold for %.2f.", this.title, this.price);
    }
}
