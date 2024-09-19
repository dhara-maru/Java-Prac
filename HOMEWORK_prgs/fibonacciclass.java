
import java.util.Scanner;

class fibonacci {

    int num1 = 0;
    int num2 = 1;

    public void getfibo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}

public class fibonacciclass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range : ");
        int n = sc.nextInt();

        fibonacci f1 = new fibonacci();
        f1.getfibo(n);

    }
}
// 1 1 2 3 5 8 13 
