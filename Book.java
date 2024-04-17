package MyDemoProject;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private String genre;
	private String publicationDate;
	private String numberOfCopies;
	private String NumAvailable;

	public Book(String title, String author, String ISBN, String genre, String publicationDate, String numberOfCopies, String NumAvailable) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.genre = genre;
		this.publicationDate = publicationDate;
		this.numberOfCopies = numberOfCopies;
		this.NumAvailable= NumAvailable;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(String numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public String getNumAvailable() {
		return NumAvailable;
	}

	public void setNumAvailable(String numAvailable) {
		NumAvailable = numAvailable;
	}
	
	
}

