
// ninjas 3 : Fahrenheit to Celsius
import java.util.*;
import java.io.*;

class toCelsius {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int gap = sc.nextInt();
        double celsius;

        for (int i = start; i <= end; i += gap) {
            celsius = (i - 32) * 5.0 / 9;

            if (celsius >= 0) {
                System.out.println(i + "\t" + (int) Math.floor(celsius));
            } else {
                System.out.println(i + "\t" + (int) Math.ceil(celsius));
            }
        }

    }
}