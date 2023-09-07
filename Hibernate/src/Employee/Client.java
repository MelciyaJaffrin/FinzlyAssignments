package Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        
		
		//create data
		Emp emp = new Emp();
		emp.setId(4);
		emp.setName("Cel");
		emp.setSalary("40000");
		session.save(emp);
		System.out.println("Data saved successfully");
		
		//read data
		Emp employee=session.load(Emp.class, 3);
		System.out.println(employee);
		
		//Update data
		Emp emp1 = new Emp();
		emp1.setId(1);
		emp1.setName("Melciya");
		emp1.setSalary("70000");
		
		session.update(emp1);
		System.out.println("Data updated successfuly");
		
		//Delete data
		Emp emp2 = new Emp();
		emp2.setId(2);
		emp2.setName("kd");
		emp2.setSalary("50000");
		
		session.delete(emp2);
		System.out.println("Data Deleted successfuly");


		
		tr.commit();
		session.close();
	}
}

