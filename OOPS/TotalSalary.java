
//ninjas 2 : Total Salary
import java.util.*;
import java.io.*;

class TotalSalary {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        char grade = sc.next().charAt(0);
        int allowance = 0;

        if (grade == 'A') {
            allowance = 1700;
        } else if (grade == 'B') {
            allowance = 1500;
        } else {
            allowance = 1300;
        }

        int totalsalary = (int) Math.round(bs + (bs * 0.2) + (bs * 0.5) + allowance - (bs * 0.11));
        System.out.println(totalsalary);

    }
}