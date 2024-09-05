public class Library {

    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added: " + book.getTitle()); // Added message
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < count; i++) {
            if (books[i].isAvailable()) {
                books[i].displayInfo();
            }
        }
    }
}

public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class Main {

    public static void main(String[] args) {
        Library library = new Library(5); 
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.showAvailableBooks();
        library.showAvailableBooks(); 
    }
}