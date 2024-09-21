
import java.util.Scanner;

// //3. Create a class named Bank_Account with data memebers accountNo, userName, email,
// accountType and accountBalance, Also create methods getAccountDetails() and
// displayAccountDetails().
class bank {

    int acno;
    String username;
    String email;
    String actype;
    double balance;

    public void getAccDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account no : ");
        acno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account Name : ");
        username = sc.nextLine();
        System.out.print("Enter account email : ");
        email = sc.nextLine();
        System.out.print("Enter account type : ");
        actype = sc.nextLine();
        System.out.print("Enter account balance : ");
        balance = sc.nextDouble();

    }

    public void displayAccDetails() {
        System.out.println("Account No : " + acno);
        System.out.println("Account Name : " + username);
        System.out.println("Account Email : " + email);
        System.out.println("Account Type : " + actype);
        System.out.println("Account Balance : " + balance);

    }

}

class bankacc {

    public static void main(String[] args) {

        bank a1 = new bank();
        a1.getAccDetails();
        a1.displayAccDetails();

    }
}
