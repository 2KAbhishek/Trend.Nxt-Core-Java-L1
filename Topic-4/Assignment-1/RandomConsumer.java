import java.util.concurrent.BlockingQueue;

public class RandomConsumer implements Runnable {

    private BlockingQueue<Integer> queue;

    public RandomConsumer(BlockingQueue<Integer> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        try {
            int num;
            // consuming messages until exit message is received
            while ((num = queue.take()) != 0) {
                System.out.println("Factorial: " + getFact(num));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long getFact(int num) {
        if (num <= 1)
            return 1;
        else
            return num * getFact(num - 1);
    }
}
