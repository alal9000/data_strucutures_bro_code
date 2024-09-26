import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public PriorityQueues() {
    }

    public void myMethod() {
        Queue<String> queue = new PriorityQueue(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println((String)queue.poll());
        }

    }
}
