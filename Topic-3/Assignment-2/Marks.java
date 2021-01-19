import java.util.Scanner;

public class Marks {
    float[] f = new float[3];
    Scanner s = new Scanner(System.in);

    void setVal(String st) throws Exception, MarksException {
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Marks for Sub " + (i + 1) + ": ");
            String sd = s.nextLine();
            try {
                f[i] = Float.parseFloat(sd);
                if (f[i] > 100 || f[i] < 0) {
                    throw new MarksException(f[i]);
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("not number");

            } catch (MarksException m) {
                throw m;
            }
        }
    }
}
