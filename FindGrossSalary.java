
import java.util.Scanner;

class FindGrossSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Basic Salary:");
        Double BS = sc.nextDouble();

        Double HRA = 0.0;
        Double DA = 0.0;

        if (BS < 1500) {
            HRA = 0.10 * BS;
            DA = 0.90 * BS;

        } else {
            HRA = 500.00;
            DA = 0.98 * BS;
        }

        Double GS = BS + HRA + DA;
        System.out.println("HRA : " + HRA + "Rs.");
        System.out.println("DA : " + DA + "Rs.");
        System.out.println("Your Gross Salary will be : " + GS + "Rs.");

    }
}
