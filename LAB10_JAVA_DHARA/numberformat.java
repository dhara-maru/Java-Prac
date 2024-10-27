import java.util.Scanner;

public class numberformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter integer 1 :");
        String n1input = sc.next();
        System.out.println("ENter integer 2 :");
        String n2input = sc.next();
        try {
            int n1 = Integer.parseInt(n1input);
            int n2 = Integer.parseInt(n2input);
            if (n2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            double result = n1 / n2;
            System.out.println("Result : " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integers. " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.toString());
        }

    }
}
