package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Product;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product product = new Product();
		product.setProductName("Mobile");
		product.setProductPrice(73500f);
		
		session.save(product);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Product Saved!!!");
		
		tx.commit();
		
		session.close();
		sfactory.close();

	}

}
