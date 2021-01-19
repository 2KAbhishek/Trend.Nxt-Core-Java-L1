public class FiveNumbers {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                double avg = 0;
                for (int i = 0; i < args.length; i++) {
                    int num = Integer.parseInt(args[i]);
                    avg += num;
                }
                avg /= args.length;
                System.out.println(avg);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + ": Need exactly 5 integers");
        }
    }
}
