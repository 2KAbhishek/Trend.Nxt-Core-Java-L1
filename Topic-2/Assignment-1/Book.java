public class Book {
    String isbn, title, author;
    double price, discountPrice;

    public Book(String isbn, String title, String auth, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = auth;
        this.price = price;
    }

    public void discountedprice(double discountPer) {
        discountPrice = ((100.0 - discountPer) / 100) * price;
    }

    public void displaydetails() {
        System.out.println("ISBN code : " + isbn);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Discounted Price : " + discountPrice);
    }
}
