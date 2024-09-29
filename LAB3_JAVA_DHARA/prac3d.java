
import java.util.*;

class prac3d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isprime = false;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            } else {
                isprime = true;
            }
        }
        if (isprime) {
            System.out.println("number is prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
