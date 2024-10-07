
class A {

    int n1 = 10;
    int n2 = 20;

    public void add() {
        System.out.println("n 1 + n2 : " + (n1 + n2));
    }
}

class B extends A {

    int n3 = 30;

    public void add2() {
        System.out.println("n1 + n2 + n3 : " + (n1 + n2 + n3));
    }
}

public class inheritance {

    public static void main(String args[]) {
        B b1 = new B();
        b1.add2();

    }

}
