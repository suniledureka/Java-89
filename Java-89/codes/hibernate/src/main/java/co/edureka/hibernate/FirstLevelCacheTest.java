package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class FirstLevelCacheTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();
		
		Student st1 = session.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println("-----------------------------------------------------------");
		
		Student st2 = session.get(Student.class, 101);
		System.out.println(st2);
		
		session.close();
		sfactory.close();
	}

}
