
import java.util.Scanner;

class staticprob1 {

    static String result;
    static int n;

    static {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            result = "Even";
        } else {
            result = "odd";
        }

    }

    public void display() {
        System.out.println("The number is " + result);
    }

}

public class staticevenodd {

    public static void main(String[] args) {

        staticprob1 p1 = new staticprob1();
        p1.display();
    }
}
