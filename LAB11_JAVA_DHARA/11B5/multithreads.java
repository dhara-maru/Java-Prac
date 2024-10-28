import java.util.*;

class randomintclass extends Thread {
    Random random = new Random();
    public static int randomint;

    public void run() {
        while (true) {
            randomint = random.nextInt(100);
            System.out.println("Random Integer : " + randomint);

            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println("Thread exception :" + e.toString());
            }
        }

    }

}

class squarethread extends Thread {

    public void run() {
        while (true) {
            if (randomintclass.randomint % 2 == 0) {
                int square = randomintclass.randomint * randomintclass.randomint;
                System.out.println("Sqaure of random even number " + randomintclass.randomint + " is :" + square);
            }
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

}

class cubethread extends Thread {

    public void run() {
        while (true) {
            if (randomintclass.randomint % 2 != 0) {
                int cube = randomintclass.randomint * randomintclass.randomint * randomintclass.randomint;
                System.out.println("Cube of random odd number " + randomintclass.randomint + " is :" + cube);
            }
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

}

public class multithreads {
    public static void main(String[] args) {
        randomintclass r1 = new randomintclass();
        squarethread s1 = new squarethread();
        cubethread c1 = new cubethread();

        r1.start();
        s1.start();
        c1.start();
    }
}
