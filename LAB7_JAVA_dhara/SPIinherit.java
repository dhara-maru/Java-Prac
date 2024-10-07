
import java.util.Scanner;

class Student {

    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    Student(int id, int subjects) {
        this.id_no = id;
        this.no_of_subjects_registered = subjects;
        this.subject_code = new String[subjects];
        this.subject_credits = new int[subjects];
        this.grade_obtained = new char[subjects];
        this.spi = 0.0;
    }

    // Method to calculate the SPI 
    public void calculate_spi() {
        int total_credits = 0;
        double total_points = 0.0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            int grade_point = getGradePoint(grade_obtained[i]);
            total_points += grade_point * subject_credits[i];
            total_credits += subject_credits[i];
        }

        if (total_credits > 0) {
            this.spi = total_points / total_credits;
        } else {
            this.spi = 0.0;
        }
    }

    private int getGradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 10;
            case 'B':
                return 8;
            case 'C':
                return 6;
            case 'D':
                return 4;
            case 'E':
                return 2;
            case 'F':
                return 0;
            default:
                return 0;
        }
    }

    public void display() {
        System.out.println("Student ID: " + id_no);
        System.out.println("Subjects registered: " + no_of_subjects_registered);
        System.out.println("SPI: " + spi);
    }
}

public class SPIinherit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter Student ID: ");
            int id_no = sc.nextInt();

            System.out.print("Enter number of subjects registered: ");
            int subjects = sc.nextInt();

            students[i] = new Student(id_no, subjects);

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter Subject Code for subject " + (j + 1) + ": ");
                students[i].subject_code[j] = sc.next();

                System.out.print("Enter Credits for subject " + (j + 1) + ": ");
                students[i].subject_credits[j] = sc.nextInt();

                System.out.print("Enter Grade obtained (A, B, C, D, E, F) for subject " + (j + 1) + ": ");
                students[i].grade_obtained[j] = sc.next().charAt(0);
            }

            students[i].calculate_spi();
        }

        // Display student details and SPI
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for Student " + (i + 1) + ":");
            students[i].display();
        }

    }
}
