import java.util.*;

public class Expense {
    String name;
    double amount;
    String category;
    int max_expenses = 10;

    public void add_expense(String name, double amount, String category) {
        try {

        } catch (Exception e) {

        }
    }

    void view_expenses() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int view_total_exp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void category_exp(String catToCheck) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'category_exp'");
    }

    void del_exp(String expToDelete) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}// Expense

public class Expense_Listing {
    public static void main(String[] args) {
        Expense e1 = new Expense();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option :");
            System.out.println("1. Add expense");
            System.out.println("2. View all expenses");
            System.out.println("3. View total expense amount");
            System.out.println("4. View expenses by category");
            System.out.println("5. Delete expense");
            System.out.println("6. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter expense amount : ");
                    double amount = sc.nextDouble();
                    System.out.print("Enter expense category : ");
                    String category = sc.nextLine();
                    e1.add_expense(name, amount, category);
                    break;
                case 2:
                    e1.view_expenses();
                    break;
                case 3:
                    System.out.println("Total expenses are of amount : " + e1.view_total_exp());
                    break;
                case 4:
                    System.out.print("Enter expense category to check : ");
                    String expToCheck = sc.nextLine();
                    e1.category_exp(expToCheck);
                    break;
                case 5:
                    System.out.print("Enter expense name you want to delete : ");
                    String expToDelete = sc.nextLine();
                    e1.del_exp(expToDelete);
                    break;
                case 6:
                    System.out.println("Okay now bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice number pls");
                    break;
            }// switch

        } // while
    }// main()
}// class