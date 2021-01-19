import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn, title, author;
        double price, discount;
        System.out.println("Enter ISBN Code: ");
        isbn = sc.nextLine();
        System.out.println("Enter Title: ");
        title = sc.nextLine();
        System.out.println("Enter Author's Name: ");
        author = sc.nextLine();
        System.out.println("Enter Price: ");
        price = sc.nextDouble();
        System.out.println("Enter Discount Percentage: ");
        discount = sc.nextDouble();
        sc.close();
        Book book = new Book(isbn, title, author, price);
        book.discountedprice(discount);
        book.displaydetails();
    }

}
