//thread synchronization
class multiplication {
    synchronized void printtab(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class mt1 extends Thread {
    multiplication m;

    mt1(multiplication m) {
        this.m = m;
    }

    public void run() {
        synchronized (m) {
            m.printtab(5);
        }

    }
}

class mt2 extends Thread {
    multiplication m;

    mt2(multiplication m) {
        this.m = m;
    }

    public void run() {
        synchronized (m) {
            m.printtab(100);
        }
    }
}

public class mul_table_thread {
    public static void main(String[] args) {
        multiplication obj = new multiplication();
        mt1 t1 = new mt1(obj);
        mt2 t2 = new mt2(obj);
        t1.start();
        t2.start();
    }
}
