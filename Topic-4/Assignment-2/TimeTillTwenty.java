import java.time.LocalTime;

public class TimeTillTwenty {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = start + 20000;
        try {
            while (System.currentTimeMillis() < end) {
                System.out.println("Current time: " + LocalTime.now().toString().substring(0, 8));
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
