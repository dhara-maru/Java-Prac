import java.util.*;

class DharaException extends Exception {
    DharaException(String msg) {
        super(msg);
    }
}

public class q4a {
    public static void main(String[] args) throws DharaException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new DharaException("You cannot go in the club");
            } else {
                System.out.println("Welcome to the club");
            }
        } catch (DharaException msg) {
            System.out.println(msg.toString());
        }

    }
}