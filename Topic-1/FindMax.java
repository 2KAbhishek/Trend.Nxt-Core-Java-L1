import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("\nMax is " + max);
    }
}
