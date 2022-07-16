package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		
		Session session = sfactory.openSession();
		
		Student st = new Student();
		System.out.println(st);
		
		try {
			//session.load(st, 101);
			session.load(st, 1234);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println(st);
		
		session.close();
		sfactory.close();
	}

}
