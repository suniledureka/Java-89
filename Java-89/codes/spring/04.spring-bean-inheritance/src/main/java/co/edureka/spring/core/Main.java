package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		User usr1 = (User)context.getBean("user1");
		System.out.println(usr1.getFirstName() + " | " + usr1.getLastName());
		
		User usr2 = (User)context.getBean("user2");
		System.out.println(usr2.getFirstName()+" | " + usr2.getLastName());		
	}

}
