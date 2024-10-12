interface A {
    final int a = 10;

    int sumA();
}

interface A1 extends A {
    final int b = 20;

    int sumA1();
}

interface A2 extends A {
    final int c = 30;

    int sumA2();
}

interface A12 extends A1, A2 {
    final int d = 40;

    int sumA12();
}

class B implements A12 {
    int e = 50;

    public int sumA() {
        return a;
    }

    public int sumA1() {
        return a + b;
    }

    public int sumA2() {
        return a + c;
    }

    public int sumA12() {
        return a + b + c + d;
    }

    public int totalSum() {
        return a + b + c + d + e;
    }
}

public class interfacedemo {
    public static void main(String[] args) {
        B objB = new B();

        System.out.println("Sum from A: " + objB.sumA());
        System.out.println("Sum from A1: " + objB.sumA1());
        System.out.println("Sum from A2: " + objB.sumA2());
        System.out.println("Sum from A12: " + objB.sumA12());
        System.out.println("Total sum including e: " + objB.totalSum());
    }
}
