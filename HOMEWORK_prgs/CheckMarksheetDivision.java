import java.util.Scanner;

public class CheckMarksheetDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += scanner.nextInt();
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 60) {
            System.out.println("First Division");
        } else if (percentage >= 50) {
            System.out.println("Second Division");
        } else if (percentage >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
