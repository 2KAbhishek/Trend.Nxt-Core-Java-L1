import java.util.Scanner;

public class MarksDemo {
    public static void main(String[] args) {
        String[] name = new String[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name for Student " + (i + 1) + " : ");
            name[i] = sc.nextLine();
        }
        Marks[] nm = new Marks[2];
        nm[0] = new Marks();
        nm[1] = new Marks();
        int l = 0;
        while (l < 2) {
            try {
                nm[l].setVal(name[l]);
                l++;
            } catch (Exception e) {
                System.out.println("Exception handled:" + e);
            }
        }
        System.out.println("The average marks are: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + " = " + (nm[0].f[i] + nm[1].f[i]) / 2);
        }

    }
}
