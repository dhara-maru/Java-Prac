import java.util.Scanner;

class bank {
    int acno;
    double balance;

    bank(int acno) {
        this.acno = acno;
        this.balance = 1000.00;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposit. Current balance : " + balance);
    }

    public void withdraw(double amount) throws Exception {
        if (balance - amount < 1000) {
            throw new Exception("Insufficient Balance !");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn. Current balance : " + balance);
        }
    }

    public double checkbal() {
        return balance;
    }

    public int getAccountNumber() {
        return acno;
    }

}

public class bankexceptiondemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // bank b1 = new bank();
        bank[] accs = new bank[5];
        int n = 0; // number of accounts
        int choice;
        while (true) {
            System.out.println("Select account operation :");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Delete account");
            System.out.println("6. Exit");

            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter account no :");
                int acno = sc.nextInt();
                accs[n] = new bank(acno);
                System.out.println("Account created !");
                n++;

            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                int acnoToDeposit = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (acnoToDeposit == accs[i].getAccountNumber()) {
                        System.out.print("Enter amount for deposit :");
                        double amount = sc.nextDouble();
                        accs[i].deposit(amount);
                    }

                }
            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                int acnoToWithdraw = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (acnoToWithdraw == accs[i].getAccountNumber()) {
                        System.out.print("Enter amount for withdrawl :");
                        double amount = sc.nextDouble();
                        try {
                            accs[i].withdraw(amount);
                        } catch (Exception e) {

                            System.out.println(e.getMessage());
                        }
                    }

                }
            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                int acnoToCheck = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (acnoToCheck == accs[i].getAccountNumber()) {
                        double result = accs[i].checkbal();
                        System.out.println("Current Balance : " + result);
                    }

                }
            } else if (choice == 5) {
                System.out.print("Enter account number: ");
                int acnoTodel = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    try {
                        if (acnoTodel == accs[i].getAccountNumber()) {
                            accs[i] = null;
                            System.out.println("Account Deleted successfully!");
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Account not found");
                    }

                }
            } else if (choice == 6) {
                System.out.println("Thanks for coming !");
                break;
            } else {
                System.out.println("Enter a valid operation");
            }
        }

    }
}