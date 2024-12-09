class thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class q128 {
    public static void main(String[] args) {
        thread1 t = new thread1();
        t.start();
    }
}