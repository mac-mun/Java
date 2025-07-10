import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListsvsArrayLists {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        /*          Linked List         */
        startTime = System.nanoTime();
        linkedList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: " + elapsedTime + " ns");

        /*          Array List         */
        startTime = System.nanoTime();
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: " + elapsedTime + " ns");


    }
}
