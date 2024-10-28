class threadr1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("1st thread using runnable");
        }
    }

}

class threadr2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("2nd thread using runnable");
        }
    }

}

public class implementsthread {
    public static void main(String[] args) {
        threadr1 r1 = new threadr1();
        Thread t1 = new Thread(r1); // Passing the Runnable's instance to a Thread object and then calling start(),
                                    // as start() is only available in Thread, not Runnable.

        threadr2 r2 = new threadr2();
        Thread t2 = new Thread(r2);

        t1.start(); // starting Thread's object bcoz start() method is only available in Thread
                    // class. not in Runnable Interface
        t2.start();
    }
}