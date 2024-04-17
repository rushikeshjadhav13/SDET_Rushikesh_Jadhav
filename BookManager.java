package MyDemoProject;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
	private Set<String> existingISBNs;

    public BookManager() {
      
        existingISBNs = new HashSet<>();
    }

    public void addBook(String ISBN) {
        existingISBNs.add(ISBN);
    }

    public boolean isISBNUnique(String ISBN) {
        return !existingISBNs.contains(ISBN);
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
      manager.addBook("Physics");
      manager.addBook("Chemistry");
      System.out.println("Is Physics unique?"+manager.isISBNUnique("Physics"));
      System.out.println("Is Mathmatics unique?"+manager.isISBNUnique("Mathmatcis"));
}
}
