class oddthread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.println("Odd : " + i);
        }
    }
}

class eventhread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even : " + i);
            }
        }
    }
}

public class oddeventhread {
    public static void main(String[] args) {
        oddthread o1 = new oddthread();
        eventhread e1 = new eventhread();
        o1.start();
        e1.start();

    }
}
