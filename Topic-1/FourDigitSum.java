import java.util.Scanner;

public class FourDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter a 4 digit number: ");
        num = sc.nextInt();
        sc.close();
        if (num < 1000 || num > 9999)
            System.out.println("Enter a 4 digit number.");
        else {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("The sum of the digits entered is: " + sum);
        }
    }

}
