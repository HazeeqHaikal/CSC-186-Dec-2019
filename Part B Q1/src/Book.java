public class Book {
    private String bookCode; // e.g BKC1147
    private String title;
    private double price;
    private String author;

    // default contructor
    public Book() {
        this.bookCode = "";
        this.title = "";
        this.price = 0.0;
        this.author = "";
    }

    // copy constructor
    public Book(Book book) {
        bookCode = book.bookCode;
        title = book.title;
        price = book.price;
        author = book.author;
    }
    // mutator
    // accessor
    // toString()
}