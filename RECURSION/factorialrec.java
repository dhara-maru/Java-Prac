
public class factorialrec {

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n = n * factorial(n - 1);

    }

    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);
    }
}
