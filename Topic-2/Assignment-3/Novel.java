public class Novel extends Book {
    String author;

    public Novel(String isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    public void displaydetails() {
        super.displaydetails();
        System.out.println("Novel Author: " + this.author);
    }
}
