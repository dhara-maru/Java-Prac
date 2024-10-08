
class A {

    int x = 10;
    int y = 20;

    public A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A {

    int x = 15;

    public B() {
        super();
        System.out.println("Constructor of class B");
    }

    public void sum() {

        int result = x + super.y;
        System.out.println("X + Y is : " + result);
    }
}

public class super_keyword {

    public static void main(String[] args) {
        B b1 = new B();
        b1.sum();
    }
}
