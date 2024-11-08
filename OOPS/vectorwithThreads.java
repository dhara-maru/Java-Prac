import java.util.Vector;

public class vectorwithThreads {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Create two threads that add elements to the vector
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                vector.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Vector size: " + vector.size()); // Should always be 200
    }
}
