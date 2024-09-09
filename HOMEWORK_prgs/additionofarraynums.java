
import java.util.*;

public class additionofarraynums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter value : ");
            a[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i <= 2; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum is : " + sum);

    }
}
