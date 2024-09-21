
import java.util.*;

class circle {

    double a;

    void getarea(double r) {
        a = Math.PI * r * r;
        System.out.println(a);
    }

}

public class area {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius : ");
        double r = sc.nextDouble();

        circle c = new circle();
        c.getarea(r);
    }
}
