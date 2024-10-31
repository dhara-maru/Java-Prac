import mathoperations.addition;
import mathoperations.subtraction;

public class packagedemo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        addition add = new addition();
        subtraction sub = new subtraction();
        System.out.println(add.sum(a, b));
        System.out.println(sub.sub(a, b));

    }
}