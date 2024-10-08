
import java.util.Scanner;

class book {

    String author_name;

    public void getdetails() {

    }

    public void displaydetails() {
    }
}

class book_publication extends book {

    String title;

    public void getdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        title = sc.nextLine();
        System.out.print("Enter author name: ");
        author_name = sc.nextLine();
    }

    public void displaydetails() {
        System.out.println("------------Book details------------");
        System.out.println("Book name: " + title);
        System.out.println("Author name: " + author_name);
    }
}

class paper_publication extends book {

    String title;

    public void getdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter paper name: ");
        title = sc.nextLine();
        System.out.print("Enter author name: ");
        author_name = sc.nextLine();
    }

    public void displaydetails() {
        System.out.println("------------Paper details------------");
        System.out.println("Paper name: " + title);
        System.out.println("Author name: " + author_name);
    }
}

public class inh2 {

    public static void main(String[] args) {
        book b1;
        book_publication bp1 = new book_publication();
        paper_publication pp1 = new paper_publication();

        b1 = bp1;
        b1.getdetails();

        b1 = pp1;
        b1.getdetails();

        b1 = bp1;
        b1.displaydetails();

        b1 = pp1;
        b1.displaydetails();
    }
}
