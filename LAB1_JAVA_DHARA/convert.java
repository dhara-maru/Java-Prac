//convert from meter to feet
import java.util.*;
public class convert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter meter: ");
        int m = sc.nextInt();
        System.out.println("feet= "+(m*3.28084));
    }
}
