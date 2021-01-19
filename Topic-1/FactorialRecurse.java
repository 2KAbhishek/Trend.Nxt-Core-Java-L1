import java.util.Scanner;

public class FactorialRecurse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + n + " = " + fact(n));
    }

    public static long fact(int n) {
        if (n == 1)
            return 1;
        else
            return (n * fact(n - 1));
    }

}
