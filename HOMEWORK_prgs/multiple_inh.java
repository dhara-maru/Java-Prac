
class A1 {

    int n1 = 10;
    int n2 = 20;

    public void add() {
        System.out.println("n 1 + n2 : " + (n1 + n2));
    }
}

class B1 extends A1 {

    int n3 = 30;

    public void add2() {
        System.out.println("n1 + n2 + n3 : " + (n1 + n2 + n3));
    }
}

class C1 extends A1 {

    int n4 = 40;

    public void add3() {
        System.out.println("n1 + n2 + n4 : " + (n1 + n2 + n4));
    }
}

public class multiple_inh {

    public static void main(String args[]) {
        B1 b1 = new B1();
        b1.add2();

        C1 c1 = new C1();
        c1.add3();

    }

}
