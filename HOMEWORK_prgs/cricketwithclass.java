
import java.util.Random;
import java.util.Scanner;

class cricketcls {

    private int overs;
    private int totalBalls;
    private int runs;
    private int wickets;
    private int ballsBowled;
    private int currentBall;
    private int currentOver;

    // Constructor to initialize the game
    public cricketcls(int overs) {
        this.overs = overs;
        this.totalBalls = overs * 6;
        this.runs = 0;
        this.wickets = 0;
        this.ballsBowled = 0;
        this.currentBall = 0;
        this.currentOver = 1;
    }

    // Method to start the game
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n--- Game Starts Now! ---\n");

        while (ballsBowled < totalBalls && wickets < 10) {
            if (currentBall == 6) {  // Start a new over after 6 balls
                currentBall = 0;
                currentOver++;
                System.out.println("\n--- Over " + currentOver + " starts ---\n");
            }

            System.out.println("Over " + currentOver + " Ball " + (currentBall + 1));
            System.out.print("Enter result of ball (run, wicket, no ball, wide, exit): ");
            String ballResult = sc.next().toLowerCase();

            // Exit the game if user types "exit"
            if (ballResult.equals("exit")) {
                System.out.println("\n************************************************");
                System.out.println("      Thank you for playing! Game Ended.         ");
                System.out.println("************************************************");
                break;
            }

            // Simulate the result of each ball
            simulateBall(ballResult, random);

            // Check if game has ended after ball result
            if (ballsBowled >= totalBalls || wickets >= 10) {
                break;
            }
        }

        if (ballsBowled >= totalBalls || wickets >= 10) {
            endGame(); // End game after all overs or wickets
        }

        sc.close();
    }

    // Simulates the result of each ball
    private void simulateBall(String ballResult, Random random) {
        switch (ballResult) {
            case "run":
                int run = random.nextInt(7); // random runs between 0 and 6
                runs += run;
                System.out.println("\nRuns scored on this ball: " + run);
                ballsBowled++;
                currentBall++;
                break;
            case "wicket":
                wickets++;
                System.out.println("\nWicket! Total wickets: " + wickets);
                ballsBowled++;
                currentBall++;
                break;
            case "noball":
                System.out.println("\nNo Ball! Free hit awarded.");
                runs++; // One extra run for no ball
                // No increment for balls, as it's not a legal delivery
                break;
            case "wide":
                System.out.println("\nWide ball! Extra run awarded.");
                runs++; // One extra run for wide
                // No increment for balls, as it's not a legal delivery
                break;
            default:
                System.out.println("\nInvalid input. Please enter 'run', 'wicket', 'noball', 'wide', or 'exit'.");
                break;
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total Runs: " + runs + " | Total Wickets: " + wickets + " | Balls Bowled: " + ballsBowled + "/" + totalBalls);
        System.out.println("------------------------------------------------\n");
    }

    // Method to display final score and game over message
    private void endGame() {
        System.out.println("\n************************************************");
        System.out.println("            Innings Ended. Final Score:          ");
        System.out.println("               " + runs + "/" + wickets + " in " + overs + " overs");
        System.out.println("************************************************");
    }
}

public class cricketwithclass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n************************************************");
        System.out.println("          Welcome to the Cricket Game!          ");
        System.out.println("************************************************\n");

        System.out.print("How many overs do you want ? : ");
        int overcount = sc.nextInt();

        cricketcls game = new cricketcls(overcount);  // Example with 5 overs
        game.startGame();
    }
}
