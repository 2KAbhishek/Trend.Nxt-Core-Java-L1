public class Book {
    String isbn, title;
    double price;

    public Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public void displaydetails() {
        System.out.println("\nISBN code: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
