
class my1 extends Thread {
    my1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("name : " + this.getName());

    }
}

public class threadprio {
    public static void main(String[] args) {
        my1 t1 = new my1("Alpha");
        my1 t2 = new my1("Mid");
        my1 t3 = new my1("cooked");
        my1 t4 = new my1("fried");
        my1 t5 = new my1("womp womp");

        t1.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}