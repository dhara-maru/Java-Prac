import java.util.*;
public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1: ");
        int n1 = sc.nextInt();
        System.out.println("enter num2: ");
        int n2 = sc.nextInt();
        System.out.println("enter num3: ");
        int n3 = sc.nextInt();
        System.out.println("Average is : "+ (n1+n2+n3)/3);
    }
}