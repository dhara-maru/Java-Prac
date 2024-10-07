
class Book {

    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class Book_publication extends Book {

    private String booktitle;

    public Book_publication(String authorname, String title) {
        super(authorname);
        this.booktitle = title;
    }

    public void display() {
        super.display();
        System.out.println("Book Title: " + booktitle);
    }
}

class Paper_publication extends Book {

    private String papertitle;

    public Paper_publication(String authorname, String papertitle) {
        super(authorname);
        this.papertitle = papertitle;
    }

    public void display() {
        super.display();
        System.out.println("Paper Title: " + papertitle);
    }
}

public class book_inherit {

    public static void main(String[] args) {

        String author_name = args[0];
        String booktitle = args[1];
        String papertitle = args[2];

        Book bp1 = new Book_publication(author_name, booktitle);
        Book pp1 = new Paper_publication(author_name, papertitle);

        bp1.display();
        pp1.display();
    }
}
