
import java.util.*;

class prac3g {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter Ending number: ");
        int r2 = sc.nextInt();

        for (int i = r1; i <= r2; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }

    }

}
