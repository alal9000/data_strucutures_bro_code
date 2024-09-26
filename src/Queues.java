import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public Queues() {
    }

    public void myMethod() {
        Queue<String> queue = new LinkedList();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.peek();
    }
}