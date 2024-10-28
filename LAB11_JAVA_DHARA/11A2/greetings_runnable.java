class GM implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Good Morning");
                // Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread exception : " + e.toString());
            }
        }

    }

}

class GA implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                System.out.println("Good Afternoon!");
                // Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread Exception : " + e.toString());
            }
        }

    }
}

public class greetings_runnable {
    public static void main(String[] args) {
        GA ga = new GA();
        Thread gat = new Thread(ga);

        GM gm = new GM();
        Thread gmt = new Thread(gm);

        gmt.start();
        gat.start();

    }
}
