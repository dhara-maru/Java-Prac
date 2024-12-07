import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Guess the number (between 1 and 100):");

        while (!guessed) {
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                guessed = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}