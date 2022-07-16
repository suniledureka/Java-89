package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		Student st = session.get(Student.class, 110);
		
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("-- no matching student found --");
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();


	}

}
