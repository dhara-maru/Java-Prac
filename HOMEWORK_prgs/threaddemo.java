class Mythread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("aaaaaaaaaaaaaaaa");
            // System.out.println("I am happy");
        }

    }
}

class Mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("..................");

            i++;
        }

    }
}

public class threaddemo {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start(); // to start a thread (why not run() ? bcoz start() calls runs() internally!)
        t2.start();
    }
}