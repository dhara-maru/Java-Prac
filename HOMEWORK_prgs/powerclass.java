
import java.util.Scanner;

class power {

    int base, exponent;

    public void getpower(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;

        }

        System.out.println("Power of given values is : " + result);
    }
}

class powerclass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        power p = new power();

        System.out.print("Enter base - ");
        int b = sc.nextInt();
        System.out.print("Enter Exponent - ");
        int e = sc.nextInt();

        p.getpower(b, e);

    }
}
