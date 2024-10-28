class myrunnablethread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("FIRST Thread using Runnable Interface!!");
        }
    }

}

class myrunnablethread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("SECOND Thread using Runnable Interface!!");
        }

    }

}

public class runnablethread {
    public static void main(String[] args) {
        myrunnablethread1 bullet1 = new myrunnablethread1();
        Thread gun1 = new Thread(bullet1);

        myrunnablethread2 bullet2 = new myrunnablethread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
