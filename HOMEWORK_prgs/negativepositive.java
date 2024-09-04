import java.util.Scanner;

public class negativepositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int difference = num1 - num2;

        if (difference < 0) {
            System.out.println("The difference is negative.");
        } else {
            System.out.println("The difference is positive.");
        }

        scanner.close();
    }
}
