package com.Employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Configuration.HibernateConfiguration;

public class Delete {
	public static void main(String[] args) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("To Delete A Employee Data");
        System.out.println("Enter Employee ID");
        employee.setId(scanner.nextInt());
        session.delete(employee);
        transaction.commit();
        session.close();
	}
}