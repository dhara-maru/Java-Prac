import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
       
    }
}
