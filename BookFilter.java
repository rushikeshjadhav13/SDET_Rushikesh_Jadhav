package MyDemoProject;

import java.util.ArrayList;
import java.util.List;

public class BookFilter {
	private List<Book> libraryBooks;

	public BookFilter() {
		// Initialize the list of library books (assuming it's pre-populated)
		libraryBooks = new ArrayList<>();
		// Add some sample books for demonstration
		libraryBooks.add(
				new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Horror", "13/05/2001", "3", "2"));
		libraryBooks.add(
				new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Romantic", "15/07/1994", "4", "1"));
		libraryBooks.add(new Book("1984", "George Orwell", "9780451524935", "Comedy", "05/02/1998", "2", "0"));
	}

	public List<Book> searchBooks(String searchTerm) {
        List<Book> matchingBooks = new ArrayList<>();
        
            // Check if the book matches the filter criteria
        for(Book book : libraryBooks) {
            if (book.getTitle().equalsIgnoreCase(searchTerm)||
            		book.getAuthor().equalsIgnoreCase(searchTerm)||
            		book.getISBN().equalsIgnoreCase(searchTerm)){
            	matchingBooks.add(book);
            
        }
            }
        return matchingBooks;
	}

	 

	public static void main(String[] args) {
		BookFilter searchSystem = new BookFilter();
		String searchTerm = "1984"; // Change this to your desired search term
		List<Book> searchResults = searchSystem.searchBooks(searchTerm);

		// Applying filters
		String genre = "Comedy"; // Change this to your desired genre
		String publicationDate = " "; // Change this to your desired publication year, or -1 if not filtering by year

		List<Book> filteredResults = searchSystem.applyFilters(searchResults, genre, publicationDate);

		if (!filteredResults.isEmpty()) {
			for (Book book : filteredResults) {
				System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: "
						+ book.getISBN() + " ,Gener: " + book.getGenre() + " ,Publication Date: "
						+ book.getPublicationDate() + " ,NumberOfCopies : " + book.getNumberOfCopies());
			}
		} else {
			System.out.println("No books found matching the search criteria.");
		}
	}

	public List<Book> applyFilters(List<Book> searchResults, String genre, String publicationDate) {
		List<Book> filteredResults = new ArrayList<>();
		for (Book book : searchResults) {
			// Check if the book matches the filter criteria
			if ((genre == null || book.getGenre().equalsIgnoreCase(genre))
					&& (publicationDate == " " || book.getPublicationDate() == publicationDate)) {
				filteredResults.add(book);
			}
		}
		return filteredResults;
	}

}
