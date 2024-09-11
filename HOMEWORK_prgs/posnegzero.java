
import java.util.*;

class posnegzero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter value - ");
            a[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            } else if (a[i] == 0) {
                zeros++;
            }
        }
        System.out.println("Positive numbers in array - " + positive);
        System.out.println("Negative numbers in array - " + negative);
        System.out.println("Zeros in array - " + zeros);
    }
}
