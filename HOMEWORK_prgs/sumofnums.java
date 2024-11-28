
public class sumofnums {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] == -1) {
                break;
            } else {
                sum += a[i];
            }
            System.out.println("Sum = " + sum);
        }
    }
}