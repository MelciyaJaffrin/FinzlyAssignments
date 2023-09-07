package com.Library;
import java.util.*;

public class LibraryManagementMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BookOperations book = new BookOperations();
		
		while(true) {
			System.out.println("Library Book Inventory Operation: \n"
					+ "1. Add a new Book:\n"
					+ "2. Search for Books \n"
					+ "3. Update Book Details \n"
					+ "4. Delete a Book \n"
					+ "5. Exit");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
            case 1:               
            	book.addBook();
                break;
                
            case 2:        
            	book.searchbookByTitle();
                break;
                
            case 3:
            	book.updateBook();
                break;
                
            case 4:
            	book.deleteBook();
                break;
                
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                
            default:
                System.out.println("Invalid choice. Please try again.");
        }
			
		}
	}

}
