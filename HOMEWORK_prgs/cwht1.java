class gm extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

class welcome extends Thread {
    public void run() {
        while (true) {
            System.out.println("welcome");
        }
    }
}

public class cwht1 {
    public static void main(String[] args) {
        gm gm1 = new gm();
        welcome welcome1 = new welcome();
        gm1.start();
        welcome1.start();
    }
}