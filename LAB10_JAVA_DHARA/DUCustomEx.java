import java.util.Scanner;

class DarshanUniException extends Exception {
    public DarshanUniException(String msg) {
        super(msg);
    }
}

class Student {
    int rno;
    String name;
    String university;
    String city;

    Student(int rno, String name, String univesity, String city) {
        this.rno = rno;
        this.name = name;
        this.university = univesity;
        this.city = city;
    }

    public void checkUni(String university) throws DarshanUniException {
        if (!university.equals("Darshan University")) {
            throw new DarshanUniException("You are in the Wrong University!");
        }
    }
}

public class DUCustomEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        int rno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter University : ");
        String university = sc.nextLine();

        String city = "";
        try {
            Student s1 = new Student(rno, name, university, city);
            s1.checkUni(university);
            System.out.print("Enter City : ");
            city = sc.nextLine();
            s1.city = city;
        } catch (DarshanUniException msg) {
            System.out.println("Custom ex : " + msg.toString());
            System.out.print("Enter City: ");
            city = sc.nextLine();
            System.out.println("You entered city: " + city);
        }

    }
}
