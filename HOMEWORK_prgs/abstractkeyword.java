abstract class a1 {
    abstract void display(); // abstract method (without body)
    // abstract static void display(); //can't be static

    void sum() { // it can have concrete method too
        System.out.println("10+20 - " + (10 + 20));
    }
}

class b1 extends a1 {
    void display() {
        System.out.println("Here's the body of abstract method");
    }
}

public class abstractkeyword {
    public static void main(String[] args) {
        b1 obj = new b1();
        obj.display();
    }
}
