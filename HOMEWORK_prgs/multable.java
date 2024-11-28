
public class multable {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}