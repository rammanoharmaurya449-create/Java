import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void displayBook() {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Year: " + year);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("\nBooks in Library:");
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

public class    libraryExampple{
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Java Programming", "James Gosling", 1995));
        library.addBook(new Book("Python Basics", "Guido van Rossum", 2000));
        library.addBook(new Book("C++ Fundamentals", "Bjarne Stroustrup", 1985));

        library.displayAllBooks();

        System.out.println("\nSearching for 'Python Basics'...");
        Book foundBook = library.searchBook("Python Basics");

        if (foundBook != null) {
            System.out.println("Book Found:");
            foundBook.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
