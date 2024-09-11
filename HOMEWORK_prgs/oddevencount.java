
import java.util.*;

class oddevencount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter value " + i + ":");
            a[i] = sc.nextInt();
        }

        int odd = 0;
        int even = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even no in array : " + even);
        System.out.println("Odd number in array : " + odd);
    }
}
