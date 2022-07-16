package co.edureka.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils 
{
	public static SessionFactory getSessionFactory() 
	{
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); //parsing xml document
		
		SessionFactory sfactory = config.buildSessionFactory();
		
		return sfactory;
	}
}
