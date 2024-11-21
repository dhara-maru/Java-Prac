import java.util.Random;
import java.util.Scanner;

// Custom exception for invalid overs
class OversLimitException extends Exception {
    OversLimitException(String errorMessage) {
        super(errorMessage);
    }
}

// abstract class
abstract class CricketGame {
    protected String gameType;
    protected String firstTeam;
    protected String secondTeam;

    public CricketGame(String gameType, String firstTeam, String secondTeam) {
        this.gameType = gameType;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public abstract void displayMatchDetails();
}

class ODIMatch extends CricketGame {
    public ODIMatch(String firstTeam, String secondTeam) {
        super("ODI", firstTeam, secondTeam);
    }

    @Override
    public void displayMatchDetails() {
        System.out.println("\nMatch Type: " + gameType);
        System.out.println("Teams: " + firstTeam + " vs " + secondTeam);
    }
}

// T20
class T20Match extends CricketGame {
    public T20Match(String firstTeam, String secondTeam) {
        super("T20", firstTeam, secondTeam);
    }

    @Override
    public void displayMatchDetails() {
        System.out.println("\nMatch Type: " + gameType);
        System.out.println("Teams: " + firstTeam + " vs " + secondTeam);
    }
}

class GameLogic {
    private int ballsBowled;
    private int totalWickets;
    private int runsScored;
    private int totalBalls;
    private final int maxWickets = 11; // final

    public GameLogic(int overs) {
        this.totalBalls = overs * 6;
        this.ballsBowled = 0;
        this.totalWickets = 0;
        this.runsScored = 0;
    }

    public boolean hasBallsRemaining() {
        return ballsBowled < totalBalls;
    }

    public boolean hasWicketsRemaining() {
        return totalWickets < maxWickets;
    }

    public int getRuns() {
        return runsScored;
    }

    public void playBall(String outcome, int runs) {
        switch (outcome) {
            case "run":
                runsScored += runs;
                ballsBowled++;
                break;
            case "wicket":
                totalWickets++;
                ballsBowled++;
                break;
            case "no-ball":
            case "wide":
                runsScored++;
                break;
            default:
                System.out.println("Invalid input. Try again.");
        }
    }

    public void displayCurrentStats() {
        System.out.println("Runs: " + runsScored + " | Wickets: " + totalWickets + " | Balls Bowled: " + ballsBowled
                + "/" + totalBalls);
    }
}

public class CricketMatchSimulator {

    public static void main(String[] args) throws OversLimitException {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("       Cricket Game    ");
        System.out.println("===============================================\n");

        String[] internationalSquads = { "India", "Australia", "England", "Pakistan", "New Zealand", "South Africa",
                "Sri Lanka", "West Indies" };

        System.out.println("Choose Game Type:");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        int gameChoice = input.nextInt();
        String gameType = (gameChoice == 1) ? "ODI" : "T20";

        // Randomly select two teams
        String[] selectedTeams = getRandomTeams(internationalSquads);
        String firstTeam = selectedTeams[0];
        String secondTeam = selectedTeams[1];

        System.out.print("Enter the number of overs for the match: ");
        int allowedOvers = input.nextInt();

        if (allowedOvers <= 0) {
            throw new OversLimitException("Overs must be a positive number greater than 0.");
        }

        CricketGame match;
        if (gameType.equals("ODI")) {
            match = new ODIMatch(firstTeam, secondTeam);
        } else {
            match = new T20Match(firstTeam, secondTeam);
        }

        match.displayMatchDetails();

        System.out.println(
                "\nStarting Match (" + allowedOvers + " Overs) between " + firstTeam + " and " + secondTeam + "!\n");

        GameLogic teamA = new GameLogic(allowedOvers);
        GameLogic teamB = new GameLogic(allowedOvers);

        String[] teamPlayers = generatePlayers(11);

        System.out.println("\n-- Innings 1: " + firstTeam + " is Batting --\n");
        simulateInnings(input, teamA, teamPlayers);

        System.out.println("\n-- Innings 2: " + secondTeam + " is Batting --\n");
        simulateInnings(input, teamB, teamPlayers);

        System.out.println("\nFinal Match Results:");
        System.out.println("Match Type: " + gameType);
        System.out.println(firstTeam + " Score: " + teamA.getRuns());
        System.out.println(secondTeam + " Score: " + teamB.getRuns());

        if (teamA.getRuns() > teamB.getRuns()) {
            System.out.println(firstTeam + " wins!");
        } else if (teamB.getRuns() > teamA.getRuns()) {
            System.out.println(secondTeam + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static String[] getRandomTeams(String[] teams) {
        Random random = new Random();
        int firstIndex = random.nextInt(teams.length);
        int secondIndex;

        // Ensure two different teams are selected
        do {
            secondIndex = random.nextInt(teams.length);
        } while (secondIndex == firstIndex);

        return new String[] { teams[firstIndex], teams[secondIndex] };
    }

    private static void simulateInnings(Scanner input, GameLogic team, String[] players) {
        System.out.println("Players for this innings:");
        for (String player : players) {
            System.out.println(player);
        }
        while (team.hasBallsRemaining() && team.hasWicketsRemaining()) {
            System.out.print("Enter ball outcome (run, wicket, no-ball, wide, exit): ");
            String outcome = input.next().toLowerCase();

            if (outcome.equals("exit")) {
                break;
            }

            int runs = 0;
        if (outcome.equals("run")) {
            boolean validRuns = false;
            while (!validRuns) {
                System.out.print("Enter runs scored: ");
                runs = input.nextInt();
                if (runs > 6) {
                    System.out.println("Invalid input: Runs cannot be greater than 6. Try again.");
                } else {
                    validRuns = true;
                }
            }
        }

            team.playBall(outcome, runs);
            team.displayCurrentStats();
        }
    }

    private static String[] generatePlayers(int count) {
        String[] players = new String[count];
        for (int i = 0; i < count; i++) {
            char playerName = (char) ('A' + i);
            players[i] = "Player " + playerName;
        }
        return players;
    }
}
