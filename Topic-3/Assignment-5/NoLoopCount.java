import java.util.Scanner;

public class NoLoopCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        System.out.print("Enter character to count: ");
        char ch = sc.nextLine().charAt(0);
        sc.close();

        int count = line.length() - line.replace(ch + "", "").length();
        System.out.println("\nCharacter count of " + ch + ": " + count);
    }
}
