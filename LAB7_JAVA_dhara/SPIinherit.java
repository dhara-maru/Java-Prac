
import java.util.Scanner;

class Students {

    int id_no;
    int no_of_subjects_registered;
    String subject_code;
    int subject_credits;
    char grade;
    float SPI;

    Students(int id_no, int no_of_subjects_registered, String subject_code, int subject_credits) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;

    }

    public void showresult() {
        System.out.println("Student ID : " + id_no);
        System.out.println("Number of subjects registered : " + no_of_subjects_registered);
        System.out.println("Subject Code : " + subject_code);
        System.out.println("Subject Credits : " + subject_credits);
        System.out.println("________________________________________________________");
        System.out.println("Grade Obtained : " + grade);
        System.out.println("________________________________________________________");
        System.out.println("SPI : " + SPI);
    }
}

public class SPIinherit {

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        Students[] s = new Students[size];

        for (int i = 0; i < s.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID : ");
            int id_no = sc.nextInt();
            System.out.print("Enter No. of subjects registered : ");
            int no_of_subjects_registered = sc.nextInt();
            System.out.print("Enter Subject Code : ");
            String subject_code = sc.next();
            System.out.print("Enter Subject Credits : ");
            int subject_credits = sc.nextInt();

            s[i] = new Students(id_no, no_of_subjects_registered, subject_code, subject_credits);
        }

        for (int i = 0; i < s.length; i++) {
            s[i].showresult();
        }

    }

}
