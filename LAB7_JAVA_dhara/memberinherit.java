import java.util.Scanner;

class member {
    String name;
    int age;
    long phone;
    String address;
    double salary;
    Scanner sc = new Scanner(System.in);

    public void printsalary() {
        System.out.println("salary : " + salary);
    }

    public void setmember() {

        System.out.print("Enter name : ");
        this.name = sc.nextLine(); // Assigning to instance variable using 'this'
        System.out.print("Enter age : ");
        this.age = sc.nextInt(); // Assigning to instance variable using 'this'
        System.out.print("Enter phone number : ");
        this.phone = sc.nextLong(); // Assigning to instance variable using 'this'
        sc.nextLine(); // Consume the newline left by sc.nextLong()
        System.out.print("Enter address : ");
        this.address = sc.nextLine(); // Assigning to instance variable using 'this'
        System.out.print("Enter salary : ");
        this.salary = sc.nextDouble(); // Assigning to instance variable using 'this'
    }

    public void printmember() {

        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("phone : " + phone);
        System.out.println("address : " + address);
        printsalary();
    }
}

class employee extends member {
    String specialization;

    public void setemployee() {
        System.out.println("------- ENTER EMPLOYEE DETAILS -------");
        setmember();
        sc.nextLine();
        System.out.print("Enter specialization : ");
        specialization = sc.nextLine();
    }

    public void printemployee() {
        System.out.println("\n------ EMPLOYEE DETAILS ------");
        printmember();
        System.out.println("specialization : " + specialization);
    }
}

class manager extends member {
    String department;

    public void setmanager() {
        System.out.println("------- ENTER MANAGER DETAILS -------");

        setmember();
        sc.nextLine();
        System.out.print("Enter department : ");
        department = sc.nextLine();
    }

    public void printmanager() {
        System.out.println("\n------ MANAGER DETAILS ------");
        printmember();
        System.out.println("department : " + department);
    }

}

public class memberinherit {
    public static void main(String[] args) {

        employee e1 = new employee();
        e1.setemployee();

        manager m1 = new manager();
        m1.setmanager();

        e1.printemployee();
        m1.printmanager();

    }
}