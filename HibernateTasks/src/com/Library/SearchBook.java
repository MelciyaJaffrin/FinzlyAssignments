package com.Library;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import Configuration.HibernateConfiguration;

public class SearchBook {
	
	static Scanner scanner = new Scanner (System.in);
	
	public static void searchByISBN() {
		
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        System.out.println("Enter ISBN Number");
        int isbn = scanner.nextInt();
        criteria.add(Restrictions.eq("isbn", isbn));
        List<BookDetails> list = criteria.list();
		for (BookDetails library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
		
	}

	public static void displayAllBooks() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
		List<BookDetails> list = criteria.list();
		for (BookDetails library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
		
	}

	public static void searchByTitle() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        System.out.println("Enter Title Of Book");
        String title = scanner.nextLine();
        criteria.add(Restrictions.eq("title", title));
		List<BookDetails> list = criteria.list();
		for (BookDetails library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
        
	}

	public static void searchByAuthor() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        System.out.println("Enter Author Of Book");
        String author = scanner.nextLine();
        criteria.add(Restrictions.eq("author", author));
		List<BookDetails> list = criteria.list();
		for (BookDetails library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
        
	}

	public static void searchByRange(Scanner fromYear, Scanner toYear) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        
        criteria.add(Restrictions.between("publicationYear", fromYear, toYear));
		List<BookDetails> list = criteria.list();
		for (BookDetails library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
		
	}


}
