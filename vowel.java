import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to handle both uppercase and lowercase input
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        } 

        scanner.close();
    }
}
