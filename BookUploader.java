package MyDemoProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookUploader {

	    private Set<String> existingISBNs;
	    private int booksAdded;
	    private int booksSkipped;

	    public BookUploader() {
	        
	        existingISBNs = new HashSet<>();
	        booksAdded = 0;
	        booksSkipped = 0;
	    }

	    public void uploadBooks(String filePath) {
	        try {
	            File file = new File(filePath);
	            Scanner scanner = new Scanner(file);

	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();

	              
	                String[] bookData = line.split(",");

	                if (bookData.length >= 1) {
	                    String ISBN = bookData[0].trim();

	                    if (!existingISBNs.contains(ISBN)) {
	                       
	                        existingISBNs.add(ISBN);
	                        booksAdded++;
	                    } else {
	                   
	                        booksSkipped++;
	                    }
	                }
	            }

	            scanner.close();
	            System.out.println("Books added: " + booksAdded);
	            System.out.println("Books skipped (due to duplicate ISBNs): " + booksSkipped);

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        BookUploader uploader = new BookUploader();
	        String filePath = "C:\\Rushikesh Jadhav\\Book1.csv"; 

	        uploader.uploadBooks(filePath);
	    }
	}

