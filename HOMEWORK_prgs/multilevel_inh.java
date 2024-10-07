
class A2 {

    int n1 = 10;
    int n2 = 20;

    public void add() {
        System.out.println("n 1 + n2 : " + (n1 + n2));
    }
}

class B2 extends A2 {

    int n3 = 30;

    public void add2() {
        System.out.println("n1 + n2 + n3 : " + (n1 + n2 + n3));
    }
}

class C2 extends B2 {

    int n4 = 40;

    public void add3() {
        System.out.println("n1 + n2 + n3 + n4 : " + (n1 + n2 + n3 + n4));
    }
}

public class multilevel_inh {

    public static void main(String args[]) {
        C2 c1 = new C2();
        c1.add3();

    }

}
