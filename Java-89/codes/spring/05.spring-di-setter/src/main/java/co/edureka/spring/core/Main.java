package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-car-beans.xml");
		
		User customer = (User)context.getBean("prv");
		System.out.println(customer.getFirstName()+" " + customer.getLastName() + ", owns a "+ customer.getCar().getModel()+
				" which costs Rs." + customer.getCar().getCost());
	}

}
