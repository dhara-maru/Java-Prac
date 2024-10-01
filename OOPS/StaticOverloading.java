
import java.util.Scanner;

class static2 {

    static int n1;
    static int n2;

    static2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;

    }

    static void operation() {
        System.out.println("Addition of n1+n2 : " + (n1 + n2));
    }

    static void operation(int n1, int n2, int n3) {
        System.out.println("Addition of n1+n2+n3 : " + (n1 + n2 + n3));
    }
}

public class StaticOverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd no : ");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd no : ");
        int n3 = sc.nextInt();

        static2 s1 = new static2(n1, n2);
        s1.operation();
        s1.operation(n1, n2, n3);

    }
}
