
import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String msg) {
        super(msg);
    }
}

class Bankacc {
    int acno;
    double bal;

    Bankacc(int acno) {
        this.acno = acno;
        this.bal = 1000.00;

    }

    public void deposit(double amt) {
        bal += amt;
        System.out.println("Amount " + amt + " Deposited !");
        System.out.println("Current Balance is : " + bal);
    }

    public void withdraw(double amt) throws InSufficientFundException {
        if (bal - amt < 1000) {
            throw new InSufficientFundException("Withdrawal denied! Balance cannot go below 1000.");
        }
        bal -= amt;
        System.out.println("Amount " + amt + " Withdrawn!");
        System.out.println("Current Balance is: " + bal);
    }

    public double checkbal() {
        return bal;
    }
}

public class InsuffBal102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankacc ac1 = new Bankacc(101);
        int choice;
        double amt;
        while (true) {
            System.out.println("Select operation : ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    amt = sc.nextDouble();
                    ac1.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amt = sc.nextDouble();
                    try {
                        ac1.withdraw(amt);
                    } catch (InSufficientFundException e) {
                        System.out.println("Custom exception: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Your Current balance is : " + ac1.checkbal());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid operation!!!");
            }
        }

        // ac1.withdraw(200);

    }
}
