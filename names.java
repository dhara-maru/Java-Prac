import java.util.*;
public class names {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your Firstname : ");
        String fname = sc.nextLine();
        System.out.println("enter your Middlename : ");
        String mname = sc.nextLine();
        System.out.println("enter your Lastname : ");
        String lname = sc.nextLine();
        System.out.println("Hello "+fname+mname+lname);
    }
}
