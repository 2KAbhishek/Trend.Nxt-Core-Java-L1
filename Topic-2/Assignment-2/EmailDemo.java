import java.util.Scanner;

public class EmailDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email details:");
        System.out.print("Enter Sender ID: ");
        String senderId = sc.next();
        System.out.print("Enter Recipient ID: ");
        String recipientId = sc.next();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.println("Enter Contents");
        String text = sc.nextLine();
        sc.close();

        Email email = new Email(text, senderId, recipientId, subject);
        System.out.println(email);
    }
}
