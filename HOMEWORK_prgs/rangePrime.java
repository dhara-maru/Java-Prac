
import java.util.Scanner;

public class rangePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (r1): ");
        int r1 = scanner.nextInt();

        System.out.print("Enter the ending number (r2): ");
        int r2 = scanner.nextInt();

        for (int i = r1; i <= r2; i++) {
            boolean isPrime = true;

            for (int k = 2; k <= i - 1; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
