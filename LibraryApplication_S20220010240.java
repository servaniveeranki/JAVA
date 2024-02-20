
import java.util.*;

public class LibraryApplication_S20220010240 {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        // intialising book details
        books[0] = new Book("Harry potter and chamber of secrets", "J.K.Rowling", "789-0987651234", 6, 3);
        books[1] = new Book("To kill a mockingbird", "Harper lee", "789-7654313164", 4, 2);
        books[2] = new Book("1984", "George Orwell", "789-4567323217", 3, 1);
        books[3] = new Book("Geetanjali", "Rabindranath Tagore", "987-54738666", 6, 5);
        books[4] = new Book("Divine Life", "shivanand", "987-0022345677", 5, 5);

        Book samplebook = new Book("Sample Book");
        System.out.println("Title : " + samplebook.getTitle());

        // searching for a book
        System.out.println("searching for books by author 'J.K.Rowling' :");
        for (Book book : books) {
            book.searchBook("J.K.Rowling");
        }

        // Issue and return of books
        books[2].issuebook();
        books[4].returnBook();
        books[1].issuebook();

        // printing book details
        System.out.println("printing the book details:");
        for (Book book : books) {
            book.printBookDetails();
            System.out.println();
        }
        // print all the details in uppercase
        System.out.println("printing book details in upper case:");
        for (Book book : books) {
            book.printUpperCase();
            System.out.println();
        }

        // update the book name
        books[0].updateBookName("chamber of secrets", "sorcers's");
        System.out.println("the updated book name:" + books[0].getTitle());

        // to arrange books in alaphabetical order
        showBooksAlphabetically(books);

    }

    // Driver class method to print book names alphabetically
    public static void showBooksAlphabetically(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));
        System.out.println("Books sorted alphabetically:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int totalcopies;
    private int issuedcopies;

    public Book() {
        this("", "", "", 0, 0);
    }

    public Book(String title) {
        this(title, "", "", 0, 0);
    }

    public Book(String title, String author, String ISBN) {
        this(title, author, ISBN, 1, 0);
    }

    public Book(String title, String author, String ISBN, int totalcopies, int issuedcopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.totalcopies = totalcopies;
        this.issuedcopies = issuedcopies;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getTotalcopies() {
        return totalcopies;
    }

    public int getIssuedcopies() {
        return issuedcopies;
    }

    // Search for a book based on title or author
    public boolean searchBook(String searchString) {
        // Check if the search string is present in either title or author
        if (title.toLowerCase().contains(searchString.toLowerCase())
                || author.toLowerCase().contains(searchString.toLowerCase())) {
            printBookDetails();
            return true;
        }
        return false;
    }

    public void issuebook() {
        if (totalcopies > 0) {
            totalcopies--;
            issuedcopies++;
        }
    }

    public void returnBook() {
        if (issuedcopies > 0) {
            totalcopies++;
            issuedcopies--;
        }
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Total copies: " + totalcopies);
        System.out.println("Issued copies: " + issuedcopies);
    }

    public void printUpperCase() {
        System.out.println("Title:" + title.toUpperCase());
        System.out.println("Author:" + author.toUpperCase());
        System.out.println("ISBN: " + ISBN);
        System.out.println("Total copies:" + totalcopies);
        System.out.println("Issued copies : " + issuedcopies);
    }

    public void updateBookName(String oldSubstring, String newSubstring) {
        if (title.toLowerCase().contains(oldSubstring.toLowerCase())) {
            title = title.replace(oldSubstring, newSubstring);
        }
    }
}
