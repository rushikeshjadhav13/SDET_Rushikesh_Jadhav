package MyDemoProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSearch {
	private List<Book> libraryBooks;

	public BookSearch() {
		// Initialize the list of library books (assuming it's pre-populated)
		libraryBooks = new ArrayList<>();
		// Add some sample books for demonstration
		libraryBooks
				.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Horror", "13/05/2001", "3","2"));
		libraryBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Romantic", "15/07/1994", "4","1"));
		libraryBooks.add(new Book("1984", "George Orwell", "9780451524935", "Comedy", "05/02/1998", "2","0"));
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

	public List<Book> searchBooks(String searchTerm) {
		List<Book> matchingBooks = new ArrayList<>();

		// Perform linear search for each book property
		for (Book book : libraryBooks) {
			if (book.getTitle().equalsIgnoreCase(searchTerm) || book.getAuthor().equalsIgnoreCase(searchTerm)
					|| book.getISBN().equalsIgnoreCase(searchTerm) || book.getGenre().equalsIgnoreCase(searchTerm)
					|| book.getPublicationDate().equalsIgnoreCase(searchTerm)
					|| book.getNumberOfCopies().equalsIgnoreCase(searchTerm)){
				matchingBooks.add(book);
			}
			
		}

		return matchingBooks;
	}
 
	public static void main(String[] args) {
        BookSearch searchSystem = new BookSearch();
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input search criteria
        System.out.print("Enter search criteria (title, author, or ISBN): ");
        String searchTerm = scanner.nextLine();

        // Perform search
        List<Book> searchResults = searchSystem.searchBooks(searchTerm);

        // Display search results
        if (!searchResults.isEmpty()) {
            System.out.println("Search results for '" + searchTerm + "':");
            for (Book book : searchResults) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
            }
        } else {
            System.out.println("No books found matching the search criteria.");
        }

        scanner.close();
    }

//	public List<Book> applyFilters(List<Book> searchResults, String genreFilter, String publicationDate) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

        
