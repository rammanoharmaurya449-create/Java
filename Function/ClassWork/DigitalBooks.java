import java.util.*;


class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void display() {
        System.out.println("ISBN: " + isbn +
                " | Title: " + title +
                " | Author: " + author +
                " | Status: " + (isAvailable ? "Available" : "Checked Out"));
    }
}


class Library {
    private List<Book> books = new ArrayList<>();

    
    public void addBook(Book book) {
        books.add(book);
    }

    
    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Success! Book borrowed.");
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    
    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    
    public void displayAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    
    public void displayAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.display();
            }
        }
    }
}

public class DigitalBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        
        library.addBook(new Book("978-01", "Java Basics", "James Gosling", true));
        library.addBook(new Book("978-02", "Data Structures", "Mark Allen", true));
        library.addBook(new Book("978-03", "Operating Systems", "Andrew Tanenbaum", true));

        int choice;

        do {
            System.out.println("\n--- Digital Bookshelf Menu ---");
            System.out.println("1. See All Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. See Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    String borrowIsbn = sc.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;

                case 3:
                    System.out.print("Enter ISBN: ");
                    String returnIsbn = sc.nextLine();
                    library.returnBook(returnIsbn);
                    break;

                case 4:
                    library.displayAvailableBooks();
                    break;

                case 5:
                    System.out.println("Exiting system");
                    break;

                default:
                    System.out.println("Invalid choice please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}