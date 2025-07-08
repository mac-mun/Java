import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class QueuePriority<S> {
    public static void main(String[] args){

        /*
        * Priority Queue - A FIFO data structure that serves elements
        *                   with the highest priorities first
        *                   before elements with lower priority
        * */

        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());

        }
    }
}
