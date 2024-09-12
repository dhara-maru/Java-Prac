
import java.util.Scanner;

public class cricket2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of overs: ");
        int overs = sc.nextInt();

        int totalRuns = 0;
        int totalWickets = 0;
        int totalBalls = 0;
        int extraRuns = 0;  // For no-ball and wide-balls

        for (int i = 1; i <= overs; i++) {
            System.out.println("Over " + i + ": ");
            int runsInOver = 0;
            for (int j = 1; j <= 6; j++) {
                System.out.print("Enter runs for ball " + j + " (W for wicket, N for no-ball, Wd for wide): ");
                String input = sc.next();

                if (input.equals("W")) {
                    totalWickets++;
                    System.out.println("Wicket!");
                } else if (input.equals("N")) {
                    extraRuns++;
                    System.out.println("No ball! 1 run added.");
                    j--; // Do not count 
                } else if (input.equals("Wd")) {
                    extraRuns++;
                    System.out.println("Wide ball! 1 run added.");
                    j--; // Do not count this ball
                } else {
                    // Manual conversion from String to int
                    int runs = 0;
                    for (int k = 0; k < input.length(); k++) {
                        runs = runs * 10 + (input.charAt(k) - '0');
                    }
                    runsInOver += runs;
                    totalRuns += runs;
                }
            }
            System.out.println("Runs in this over: " + runsInOver);
        }

        int avgRuns = (totalRuns + extraRuns) / (overs * 6);

        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Total Wickets: " + totalWickets);
        System.out.println("Extra Runs: " + extraRuns);
        System.out.println("Average Runs per Ball: " + avgRuns);
    }
}
