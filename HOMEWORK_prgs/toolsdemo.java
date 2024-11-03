import tools.calc;
import tools.advcalc;

public class toolsdemo {
    public static void main(String[] args) {
        calc calc1 = new calc();
        advcalc advcalc1 = new advcalc();

        System.out.println(calc1.sum(10, 15));
        System.out.println(calc1.minus(10, 10));
        System.out.println(advcalc1.multiply(10, 15));
        System.out.println(advcalc1.divide(10, 15));

    }
}