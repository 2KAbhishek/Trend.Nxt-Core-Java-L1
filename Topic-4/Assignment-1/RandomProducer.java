import java.util.concurrent.BlockingQueue;

public class RandomProducer implements Runnable {

    private BlockingQueue<Integer> queue;

    public RandomProducer(BlockingQueue<Integer> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // For slowing down producer
                Thread.sleep(i);
                int random = 1 + (int) (Math.random() * 10);
                queue.put(random);
                System.out.println("Number: " + random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 0 is the exit message
        try {
            queue.put(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
