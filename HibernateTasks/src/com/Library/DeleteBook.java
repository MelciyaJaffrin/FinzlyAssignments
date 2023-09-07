package com.Library;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Configuration.HibernateConfiguration;

public class DeleteBook {
	
	Scanner scanner = new Scanner(System.in);
	
	public void deleteBook() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        BookDetails book2 = new BookDetails();
        System.out.println("Enter isbn of Book to delete: ");
        int isbn = scanner.nextInt();
        book2.setIsbn(isbn);
        
        session.delete(book2);
        System.out.println("Book Deleted Successfully");
        tr.commit();      
		
	}

}
