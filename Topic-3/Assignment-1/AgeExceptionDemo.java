public class AgeExceptionDemo {
    public static void main(String[] args) throws Exception, AgeException {
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age > 59) {
                throw new AgeException(age);
            }
            System.out.println(name + "\n" + age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
