class parent {
    int val = 10;

    void dis() {
        System.out.println("parent");
    }
}

class child extends parent {
    int val = 20;

    void dis() {
        System.out.println("child");
    }

    void demo() {
        this.dis();
        super.dis();
        System.out.println(this.val);
        System.out.println(super.val);
    }
}

public class superandthis {
    public static void main(String[] args) {
        child c = new child();
        c.demo();
    }
}
