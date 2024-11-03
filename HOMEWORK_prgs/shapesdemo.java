import shapes.*;

public class shapesdemo {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.getarea(30);

        square s1 = new square();
        s1.getarea(30);

        triangle t1 = new triangle();
        t1.getarea(30, 30);
    }
}