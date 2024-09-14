
import java.util.*;

class secondhalfstr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        int length = str.length();
        int right = str.length() - 1;
        int mid = str.length() / 2;

        System.out.println("length of the string : " + length);
        System.out.print("Second half : ");
        for (int i = mid; i <= right; i++) {  //for right half
            char d = str.charAt(i);
            System.out.print(d);
            d++;
        }

        System.out.println();
        System.out.print("First half : ");
        for (int i = 0; i <= mid; i++) {  //for left half
            char d = str.charAt(i);
            System.out.print(d);
            d++;
        }
    }
}
