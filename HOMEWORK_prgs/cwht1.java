class gm extends Thread {
    public void run() {
        int i = 0;
        while (i <= 50) {
            System.out.println("Good morning");
            i++;
        }
    }
}

class welcome extends Thread {
    public void run() {
        int i = 0;
        while (i <= 50) {
            try {
                // Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("welcome");
            i++;
        }
    }
}

public class cwht1 {
    public static void main(String[] args) {
        gm gm1 = new gm();
        welcome welcome1 = new welcome();

        gm1.start();
        welcome1.start();
        welcome1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(gm1.getPriority());
        System.out.println(welcome1.getPriority());

    }
}