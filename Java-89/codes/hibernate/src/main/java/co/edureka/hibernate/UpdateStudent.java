package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//--- approach - 1 ---
		Student st = new Student(101,"Sunil","sunil@edureka.co", "1234567890");
		session.update(st);
		*/
		
		//--- approach-2 ---
		Student st = session.get(Student.class, 103);
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Dinesh Kumar"); //dirty object
		}
		else {
			System.out.println("--- no matching student found ---");
		}
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}
}
