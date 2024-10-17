import java.util.Scanner;

public class customException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int n = 0;
        try {

            if (!sc.hasNextInt()) {
                throw new DharaException("Invalid input! Please enter a valid integer.");
            }
            n = sc.nextInt();
        } catch (DharaException e) {
            System.out.println("Dhara's Custom exxception : " + e.toString());
        }

        System.out.println("N - " + n);
    }

    static class DharaException extends Exception {

        public DharaException(String ce) {
            super(ce);
        }
    }
}