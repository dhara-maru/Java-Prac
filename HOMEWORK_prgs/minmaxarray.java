
import java.util.*;

class minmaxarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter value " + i + ":");
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i] + 1) {
                min = a[i];
            } else if (a[i] < a[i] + 1) {
                max = a[i];
            }
        }

        System.out.println("min no in array : " + min);
        System.out.println("max number in array : " + max);
    }
}
