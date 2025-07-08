import java.util.LinkedList;

public class Queue {
    public static void main(String[] args){

        /*
        * Queue = FIFO data structure. First-In First-Out (ex. A line of people)
        *         A collection designed for holding elements prior to processing
        *         Linear Data Structure
        *
        *         add = enqueue, offer()
        *         remove = dequeue, poll()
        * */

        /*
        * Uses of Queues
        * 1. Keyboard Buffer - Letter should appear on the screen in the order they are pressed
        * 2. Printer Queue - Print Jobs should be completed in order
        * 3. Used in LinkedLists, PriorityQueues, Breadth-First Search
        * */

        LinkedList<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harrod");

        System.out.println(queue.peek());

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());

//        Additional Methods
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harrod"));


        System.out.println(queue);


    }
}
