public class Magazine extends Book {
    String type;

    public Magazine(String isbn, String title, double price, String type) {
        super(isbn, title, price);
        this.type = type;
    }

    public void displaydetails() {
        super.displaydetails();
        System.out.println("Magazine Type: " + this.type);
    }
}
