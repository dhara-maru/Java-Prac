
import java.util.Scanner;

public class switchdemojava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 numbers:\n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1: Find Max");
        System.out.println("2: Find Min");
        System.out.println("3: Find Sum");
        System.out.println("4: Find Avg");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                int max = num1;
                if (num2 > max) {
                    max = num2;
                }
                if (num3 > max) {
                    max = num3;
                }
                if (num4 > max) {
                    max = num4;
                }
                if (num5 > max) {
                    max = num5;
                }
                System.out.println("The maximum value is: " + max);
                break;

            case 2:

                int min = num1;
                if (num2 < min) {
                    min = num2;
                }
                if (num3 < min) {
                    min = num3;
                }
                if (num4 < min) {
                    min = num4;
                }
                if (num5 < min) {
                    min = num5;
                }
                System.out.println("The minimum value is: " + min);
                break;

            case 3:

                int sum = num1 + num2 + num3 + num4 + num5;
                System.out.println("The sum is: " + sum);
                break;

            case 4:

                double avg = (num1 + num2 + num3 + num4 + num5) / 5.0;
                System.out.println("The average is: " + avg);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
