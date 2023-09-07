package com.Library;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Configuration.HibernateConfiguration;

public class AddBook {
Scanner scanner = new Scanner(System.in);
	
	public void addBook() {
		
		//BookDetails book = new BookDetails();
		
		System.out.println("Enter Book Title: ");
		String title = scanner.nextLine();
		
		System.out.println("Enter Author Name: ");
		String author = scanner.nextLine();
		
		System.out.println("Enter Publication year: ");
		int publicationYear = scanner.nextInt();
		
		System.out.println("Enter ISBN Number: ");
		int isbn = scanner.nextInt();
		
		BookDetails book = new BookDetails();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublication_year(publicationYear);
        book.setIsbn(isbn);
		
        Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        session.save(book);
        System.out.println("Data saved successfully");
        tr.commit();
		
		
	}

}
