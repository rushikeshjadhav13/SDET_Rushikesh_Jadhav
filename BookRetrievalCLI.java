package MyDemoProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRetrievalCLI {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        // Assume the libraryBooks list is populated with book data
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Fiction", "1925","5","3");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Fiction", "1960","7","0");
        Book book3 = new Book("1984", "George Orwell", "9780451524935", "Science Fiction", "1949","3", "2");

        // Perform search and get a list of search results
        List<Book> searchResults = new ArrayList<>();
        searchResults.add(book1);
        searchResults.add(book2);
        searchResults.add(book3);

        // Display search results with book numbers
        System.out.println("Search Results:");
        for (int i = 0; i < searchResults.size(); i++) {
            Book book = searchResults.get(i);
            System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
        }

        // Prompt user to select a book
        System.out.print("Enter the book number for more details: ");
		int selectedBookNumber = scanner.nextInt();

        // Validate the selected book number
        if (selectedBookNumber >= 1 && selectedBookNumber <= searchResults.size()) {
            Book selectedBook = searchResults.get(selectedBookNumber - 1);

            // Display complete details of the selected book
            System.out.println();
            displayBookDetails(selectedBook);
        } else {
            System.out.println("Invalid book number. Please try again.");
        }
    }

	public static void displayBookDetails(Book book) {
        // Display book details
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Publication Year: " + book.getPublicationDate());
        System.out.println("Number of Copies: " + book.getNumberOfCopies());
        System.out.println("Available Copies: " + book.getNumAvailable());
        System.out.println();
    }
}
