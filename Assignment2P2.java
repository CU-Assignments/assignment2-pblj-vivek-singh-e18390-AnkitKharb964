import java.util.Scanner;

// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class for Fiction books
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

// Derived class for Non-Fiction books
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

// Main class
public class Assignment2P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create sample books
        Fiction[] fictionBooks = {
                new Fiction("Harry Potter", "J.K. Rowling", 500),
                new Fiction("The Hobbit", "J.R.R. Tolkien", 450)
        };

        NonFiction[] nonFictionBooks = {
                new NonFiction("Sapiens", "Yuval Noah Harari", 700),
                new NonFiction("Educated", "Tara Westover", 600)
        };

        // Ask user for book type preference
        System.out.println("Enter book type (Fiction/Non-Fiction): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        // Display books based on user input
        if (choice.equals("fiction")) {
            System.out.println("\nAvailable Fiction Books:");
            for (Fiction book : fictionBooks) {
                book.displayDetails();
            }
        } else if (choice.equals("non-fiction")) {
            System.out.println("\nAvailable Non-Fiction Books:");
            for (NonFiction book : nonFictionBooks) {
                book.displayDetails();
            }
        } else {
            System.out.println("Invalid choice! Please enter 'Fiction' or 'Non-Fiction'.");
        }

        scanner.close();
    }
}
