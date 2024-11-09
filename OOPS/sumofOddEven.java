
//ninjas 4 : sum of odd and even
import java.util.*;

class sumofOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int odds = 0;
        int evens = 0;

        while (N != 0) {
            int digit = N % 10;
            if (digit % 2 == 0) {
                evens += digit;
            } else {
                odds += digit;
            }
            N = N / 10;
        }

        System.out.println(evens + "\t" + odds);
    }
}