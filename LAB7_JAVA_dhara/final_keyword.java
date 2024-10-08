
class A {

    final int x = 10;

    public void changeX() {
        x = 20;
    }
}

public class final_keyword {

    public static void main(String[] args) {
        A a = new A();
        a.changeX();
    }
}
