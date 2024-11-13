class product {
    int item;

    synchronized void product_put(int item) {
        this.item = item;
        for (int i = 1; i <= item; i++) {
            System.out.println("Produced : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    synchronized void product_get() {
        for (int i = 1; i <= item; i++) {
            System.out.println("Consumed : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

class producer extends Thread {
    product p;

    producer(product p) {
        this.p = p;
    }

    public void run() {
        synchronized (p) {
            p.product_put(10);
        }
    }
}

class consumer extends Thread {
    product p;

    consumer(product p) {
        this.p = p;
    }

    public void run() {
        synchronized (p) {
            p.product_get();
        }
    }
}

public class prod_consumer {
    public static void main(String[] args) {
        product p = new product();
        producer producer_obj = new producer(p);
        consumer consumer_obj = new consumer(p);
        producer_obj.start();
        consumer_obj.start();
    }
}
