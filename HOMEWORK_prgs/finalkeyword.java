final class A {

    final int a = 10;

    // a=20; error
    final void display() { // Final method - cannot be overridden in subclasses
        System.out.println("This is the final method");
    }

}

// class B extends A{ //error bcoz final method can't be overriden
class B {
    int a = 20;

}

public class finalkeyword {
    public static void main(String[] args) {
        A a1 = new A();
        // a1.a = 30; error

        a1.display();
    }
}