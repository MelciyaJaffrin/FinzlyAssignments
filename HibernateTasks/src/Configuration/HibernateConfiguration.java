package Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
	
	private HibernateConfiguration(){
	}
	
	public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.Library.BookDetails.class);
        configuration.addAnnotatedClass(com.Employee.Employee.class);
        configuration.configure("hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }

}