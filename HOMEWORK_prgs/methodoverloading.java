
class overloadcls {

    int a = 10, b = 20;

    void add() {
        System.out.println("a+b - " + (a + b));
    }

    void add(int c, int d) {
        System.out.println("a+b+c+d - " + (a + b + c + d));
    }

    void add(int c) {
        System.out.println("a+b+c - " + (a + b + c));
    }
}

public class methodoverloading {

    public static void main(String[] args) {
        overloadcls obj = new overloadcls();

        obj.add();
        obj.add(30);
        obj.add(40, 50);
    }

}
