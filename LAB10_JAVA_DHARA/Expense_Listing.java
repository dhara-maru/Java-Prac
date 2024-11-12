
import java.util.*;

class Expense {
    String name;
    double amount;
    String category;
    int max_expenses = 10;

    public Expense(String name, double amount, String category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    ArrayList<Expense> expenses = new ArrayList<>();

    public void add_expense(String name, double amount, String category) {
        if (expenses.size() < max_expenses) {
            Expense newExpense = new Expense(name, amount, category);
            expenses.add(newExpense);
            System.out.println("Expense added successfully.");
        } else {
            System.out.println("Cannot add more expenses. Maximum limit reached.");
        }
    }

    public void view_expenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to show.");
        } else {
            for (Expense exp : expenses) {
                System.out.println("Name: " + exp.name + ", Amount: " + exp.amount + ", Category: " + exp.category);
            }
        }
    }

    public double view_total_exp() {
        double total = 0;
        for (Expense exp : expenses) {
            total += exp.amount;
        }
        return total;
    }

    public void category_exp(String catToCheck) {
        boolean found = false;
        for (Expense exp : expenses) {
            if (exp.category.equalsIgnoreCase(catToCheck)) {
                System.out.println("Name: " + exp.name + ", Amount: " + exp.amount);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No expenses found in this category.");
        }
    }

    void del_exp(String expToDelete) {
        Iterator<Expense> i = expenses.iterator();
        boolean found = false;
        while (i.hasNext()) {
            Expense exp = i.next();
            if (exp.name.equalsIgnoreCase(expToDelete)) {
                i.remove();
                System.out.println("Expense deleted.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Expense not found.");
        }
    }
}// Expense

public class Expense_Listing {
    public static void main(String[] args) {
        Expense e1 = new Expense("", 0, "");
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
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter expense amount : ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
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
            } // switch
        } // while
    } // main()
} // class
