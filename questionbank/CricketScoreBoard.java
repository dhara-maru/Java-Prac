import java.util.Scanner;

public class CricketScoreBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take the number of overs as input
        System.out.print("Enter the number of overs: ");
        int overs = scanner.nextInt();

        // Step 2: Declare a 2D array to store runs for each ball (6 balls per over)
        int[][] scoreBoard = new int[overs][6];
        int totalRuns = 0;
        int totalBalls = 0;

        // Step 3: Take input for runs/events for each ball in each over
        for (int i = 0; i < overs; i++) {
            System.out.println("Enter runs or events for Over " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Ball " + (j + 1) + ": ");
                int run = scanner.nextInt();

                // Step 4: Handle special events: No Ball (-1), Wide Ball (-2), Wicket (-3)
                if (run == -1) {
                    System.out.println("No Ball! Adds 1 extra run.");
                    totalRuns += 1; // Add 1 run for No Ball
                } else if (run == -2) {
                    System.out.println("Wide Ball! Adds 1 extra run.");
                    totalRuns += 1; // Add 1 run for Wide Ball
                } else if (run == -3) {
                    System.out.println("Wicket on Ball " + (j + 1) + "!");
                } else if (run >= 0 && run <= 6) {
                    totalRuns += run; // Add regular runs (0 to 6)
                } else {
                    System.out.println("Invalid input! Please enter a valid run value.");
                    j--; // Repeat the current ball if input is invalid
                    continue;
                }

                scoreBoard[i][j] = run; // Store the run/event in the scoreboard
                totalBalls++; // Count the number of balls played
            }
        }

        // Step 5: Print the final cricket scoreboard
        System.out.println("\nCricket Scoreboard:");
        for (int i = 0; i < overs; i++) {
            System.out.print("Over " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                if (scoreBoard[i][j] == -1) {
                    System.out.print("NB ");
                } else if (scoreBoard[i][j] == -2) {
                    System.out.print("WB ");
                } else if (scoreBoard[i][j] == -3) {
                    System.out.print("W ");
                } else {
                    System.out.print(scoreBoard[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Step 6: Calculate the average run rate (total runs / number of overs)
        double averageRunRate = (double) totalRuns / overs;

        // Step 7: Display total runs and average run rate
        System.out.println("\nTotal Runs: " + totalRuns);
        System.out.println("Average Run Rate: " + averageRunRate);
    }
}
