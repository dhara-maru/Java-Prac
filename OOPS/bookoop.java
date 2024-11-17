class Book {
    String title;
    String author;
    double price;
    String ISBN;

    public Book(String title, String author, double price, String ISBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + ISBN);
    }

    public void applyDiscount(double discountPercentage) {
        price -= price * discountPercentage / 100;
    }
}

public class bookoop {
    public static void main(String[] args) {

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 15.99, "978-0-316-76948-0");
        Book book2 = new Book("1984", "George Orwell", 18.99, "978-0-452-28423-4");

        System.out.println("Before discount:");
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();

        book1.applyDiscount(10);

        System.out.println("\nAfter discount:");
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
    }
}
