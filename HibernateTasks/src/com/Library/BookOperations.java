package com.Library;

import java.util.*;

public class BookOperations extends BookDetails{
	
	Scanner scanner = new Scanner(System.in);
	
	public void addBook() {
		
		AddBook add = new AddBook();
		add.addBook();
	}
	
	public void updateBook() {
		
        UpdateBook update = new UpdateBook();
        update.updateBook();
	}
	
	public void deleteBook() {
		
		DeleteBook delete = new DeleteBook();
		delete.deleteBook();
		
	}

	public void searchbookByTitle(){
		
		SearchBook.searchByISBN();
		SearchBook.searchByTitle();
		SearchBook.searchByAuthor();
		SearchBook.searchByRange(scanner,scanner);
		SearchBook.displayAllBooks();
		
	}
}
