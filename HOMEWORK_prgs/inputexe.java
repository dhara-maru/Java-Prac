
import java.util.InputMismatchException;
import java.util.Scanner;

public class inputexe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer only :");

        try {
            int nm = sc.nextInt();
            System.out.println("Entered Number : " + nm);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
