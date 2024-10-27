import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class outofRANGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            if (number < 10 || number > 50) {
                throw new OutOfRangeException("Number is out of range.");
            }

            int square = number * number;
            System.out.println("The square of " + number + " is: " + square);

        } catch (OutOfRangeException e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}
