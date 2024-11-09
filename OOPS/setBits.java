//ninjas 6 : set bits
import java.util.Scanner;

public class setBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int N = sc.nextInt();

        int count = 0;

        while (N > 0) {
            if ((N & 1) == 1) {
                count++;
            }
            N = N >> 1;
        }

        System.out.println("Number of 1's in binary representation: " + count);

    }
}
