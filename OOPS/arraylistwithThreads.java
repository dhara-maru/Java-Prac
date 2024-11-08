import java.util.ArrayList;

public class arraylistwithThreads {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Created two threads that add elements to the list
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                list.add(i);
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

        System.out.println("ArrayList size: " + list.size()); // Output may vary
    }
}
