import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10); // adds
        q.offer(20);
        q.offer(30);
        q.offer(40);

        q.poll(); // removes first elem
        q.remove(); // but it's not safe for empty queues
        System.out.println(q.peek()); // top or first elem

        Iterator i = q.iterator();
        while (i.hasNext()) {
            System.out.println("Queue : " + i.next());
        }

    }
}
