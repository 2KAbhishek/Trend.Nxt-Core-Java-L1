import java.util.Scanner;

public class MinsToYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long mins = sc.nextLong();
        sc.close();
        minToYear(mins);
    }

    static void minToYear(long mins) {
        int years = (int) mins / (60 * 24 * 365);
        int days = (int) (mins / (60 * 24)) % 365;
        System.out.println((int) mins + " Minutes is approximately " + years + " Years and " + days + " Days.");
    }

}
