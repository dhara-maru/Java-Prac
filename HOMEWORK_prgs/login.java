
import java.util.Scanner;

class login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your uname:");
        String id = sc.next();
        System.out.println("Enter your pwd:");
        String pwd = sc.next();

        System.out.println("Now login");
        System.out.println("Enter your registered username:");
        String eid = sc.next();

        if (id.equals(eid)) {

            System.out.println("Enter your registered pwd:");
            String epwd = sc.next();

            if (pwd.equals(epwd)) {
                System.out.println("Logged in successfully!");
            } else {
                System.out.println("Invalid password");
            }
        } else {

            System.out.println("Invalid username");
        }
    }

}
