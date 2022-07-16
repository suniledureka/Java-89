package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();

		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName = 'Justin'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName like 'A%'";
		//Query<Student> query = session.createQuery(hql, Student.class);
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters		
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(0, 103);
		query.setParameter(1, 200);
		*/
		
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters		
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minsid", 105);
		query.setParameter("maxsid", 200);
		
		List<Student> students = query.getResultList();
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		Transaction tx = session.beginTransaction();
		
		hql = "update co.edureka.hibernate.entity.Student set studentName='Sunil Joseph', "
				+ "studentMobile='9848586878' where studentId=101";
		
		Query q = session.createQuery(hql);
		int rowsAffected = q.executeUpdate();
		System.out.println("students updated = " + rowsAffected);
		
		tx.commit();
		session.close();		
		sfactory.close();
	}

}
