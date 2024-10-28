class thread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("My thread 1 is running | Extended Thread Class");
        }

    }
}

class thread2 extends Thread {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("My thread 2 is running | Extended Thread Class");
        }

    }
}

public class extendsthread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start(); // no need to call run method bcoz start() calls run() internally
    }
}
