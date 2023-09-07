package com.Library;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Configuration.HibernateConfiguration;

public class UpdateBook {
	
	Scanner scanner = new Scanner(System.in);
	
    public void updateBook() {
		
        System.out.println("Enter Book Title: ");
		String title = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Enter Author Name: ");
		String author = scanner.nextLine();
		
		System.out.println("Enter Publication year: ");
		int publicationYear = scanner.nextInt();
		
		System.out.println("Enter ISBN Number: ");
		int isbn = scanner.nextInt();
		
		BookDetails book1 = new BookDetails();
        book1.setTitle(title);
        book1.setAuthor(author);
        book1.setPublication_year(publicationYear);
        book1.setIsbn(isbn);
        
        Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        
        session.update(book1);
        System.out.println("Data updated successfuly");
        tr.commit();
		
		
	}

}
