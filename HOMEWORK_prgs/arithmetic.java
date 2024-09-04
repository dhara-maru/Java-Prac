import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1: ");
        int n1 = sc.nextInt();
        System.out.println("enter num2: ");
        int n2 = sc.nextInt();
        System.out.println("Sum is : "+ (n1+n2));
        System.out.println("Minus is : "+ (n1-n2));
        System.out.println("Multiplication is : "+ (n1*n2));
        System.out.println("Division is : "+ (n1/n2));
    }
}
