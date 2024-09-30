
import java.util.Scanner;

class aoostudent {

    String name;
    int rno;
    String uni = "Darshan University";

    aoostudent(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    public void display() {
        System.out.println("Name : " + name + "\t roll no : " + rno + "\t College : " + uni);
    }

}

public class arrayofobjstud {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        String name;
        int rno;
        aoostudent[] s = new aoostudent[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter name : ");
            name = sc.next();
            System.out.print("enter roll no : ");
            rno = sc.nextInt();
            s[i] = new aoostudent(name, rno);

        }
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }

    }
}
