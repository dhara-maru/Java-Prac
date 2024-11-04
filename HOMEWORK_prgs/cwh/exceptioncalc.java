
import java.util.Scanner;

class Calculator2 extends Exception {
    public Calculator2(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Invalid input Exception";
    }

    // @Override
    // public String getMessage() {
    // return "Invalid input Exception";
    // }

}

public class exceptioncalc {
    public static int add(int a, int b) throws Calculator2 {
        if (a > 10000 || b > 10000) {
            throw new Calculator2("Max input Exception: input should not be greater than 10000");
        }
        return a + b;
    }

    public static int multiply(int a, int b) throws Calculator2 {
        if (a > 7000 || b > 7000) {
            throw new Calculator2("Max input Exception: input should not be greater than 7000");
        }
        return a * b;
    }

    public static float divide(int a, int b) throws Calculator2 {
        if (a > 7000 || b > 7000) {
            throw new Calculator2("Max input Exception: input should not be greater than 7000");
        }
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero Exception");
        }
        return (float) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose between the following options:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter number 1 and number 2:");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();

                try {
                    int res = add(a1, b1);
                    System.out.println("The result is " + res);
                } catch (Calculator2 e) {
                    System.out.println(e.getMessage());
                }

                break;

            case 2:
                System.out.println("Enter number 1 and number 2:");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();

                try {
                    int res = multiply(a2, b2);
                    System.out.println("The result is " + res);
                } catch (Calculator2 e) {
                    System.out.println(e.getMessage());
                }

                break;

            case 3:
                System.out.println("Enter number 1 and number 2:");
                int a3 = sc.nextInt();
                int b3 = sc.nextInt();

                try {
                    float res = divide(a3, b3);
                    System.out.println("The result is " + res);
                } catch (Calculator2 | ArithmeticException e) {
                    System.out.println(e.getMessage());
                }

                break;

            default:
                System.out.println("Invalid option");
                break;
        }

    }
}