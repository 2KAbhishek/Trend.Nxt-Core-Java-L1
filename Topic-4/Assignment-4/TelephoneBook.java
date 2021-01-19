import java.util.HashMap;
import java.util.Scanner;

public class TelephoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        System.out.print("Enter number of contacts: ");
        int size = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter contact name: ");
            String contactName = sc.nextLine();
            System.out.print("Enter contact number: ");
            String contactNumber = sc.nextLine();
            contacts.put(contactName, contactNumber);
        }

        System.out.print("\nSearch for whose number? -> ");
        String search = sc.nextLine();
        sc.close();
        if (contacts.containsKey(search)) {
            System.out.println(search + "'s number: " + contacts.get(search));
        } else {
            System.out.println(search + "'s number not found.");
        }
    }
}
