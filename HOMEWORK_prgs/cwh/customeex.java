import java.util.Scanner;

class NegativeRadiusException extends Exception {
    public String getMessage() {
        return "Cannot be negative radius!";
    }
}

public class customeex {
    public static void getarea(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double area = Math.PI * r * r;
        System.out.println("area is :" + area);
    }

    public static void main(String[] args) throws NegativeRadiusException {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius :");
        int r = sc.nextInt();
        getarea(r);

        System.out.println("after exception");
    }
}