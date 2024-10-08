
import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);
    int id_no;
    String name;
    int no_of_subjects_registered;
    String[] subjects = {"DBMS", "OOPJ", "FOA", "WT"};
    int[] subject_credits = {6, 6, 5, 5};
    int[] marks = new int[4];
    double totalCredits = 0;
    double sumPoints = 0;
    double SPI;

    // Student(int id_no, String name, int no_of_subjects_registered) {
    Student(int id_no, String name) {
        this.id_no = id_no;
        this.name = name;
        // this.no_of_subjects_registered = no_of_subjects_registered;
    }

    public void getStudentDetails() {
        //for (int i = 0; i < no_of_subjects_registered; i++) {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            totalCredits += subject_credits[i];
        }
    }

    public double calcGradePoints() {
        //for (int i = 0; i < no_of_subjects_registered; i++) {
        for (int i = 0; i < subjects.length; i++) {
            int gradePoint;
            if (marks[i] >= 90) {
                gradePoint = 10;
            } else if (marks[i] >= 80) {
                gradePoint = 9;
            } else if (marks[i] >= 70) {
                gradePoint = 8;
            } else if (marks[i] >= 60) {
                gradePoint = 7;
            } else if (marks[i] >= 50) {
                gradePoint = 6;
            } else if (marks[i] >= 40) {
                gradePoint = 4;
            } else {
                gradePoint = 0;
            }
            sumPoints += (gradePoint * subject_credits[i]);
        }
        return sumPoints;
    }

    public double calcSPI() {
        SPI = sumPoints / totalCredits;
        return SPI;
    }

    public void displayResult() {
        System.out.println("ID No : " + id_no);
        System.out.println("Name : " + name);
        System.out.println("SPI : " + SPI);
    }
}

public class inh1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(args[0]);
        Student[] students = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter ID No : ");
            int id_no = sc.nextInt();
            System.out.println("Enter name : ");

            String name = sc.next();
            // System.out.println("Enter number of subjects registered (max 4): ");
            // int no_of_subjects_registered = sc.nextInt();

            // students[i] = new Student(id_no, name, no_of_subjects_registered);
            students[i] = new Student(id_no, name);
            students[i].getStudentDetails();
            students[i].calcGradePoints();
            students[i].calcSPI();
            students[i].displayResult();
        }
    }
}
