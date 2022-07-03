package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		//List<Integer> marks = Arrays.asList(90,92,94,96,98,88,86);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(90); marks.add(92); marks.add(94);
		marks.add(96); marks.add(98); marks.add(88); marks.add(86);
		
		System.out.println(marks);
		
		iterate1(marks);
		Thread.sleep(1500);
		
		iterate2(marks);
		Thread.sleep(1500);
		
		iterate3(marks);
		Thread.sleep(1500);
		
		iterate4(marks);
		Thread.sleep(1500);
		
		iterate5(marks);
	}
	
	static void iterate1(List<Integer> marks) {
		System.out.println(">>> list iteration using for loop and get() method --- only for List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}
	
	static void iterate2(List<Integer> marks) {
		System.out.println(">>> list iteration using enhanced for loop");
		for(Integer n : marks) {
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void iterate3(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}
	
	static void iterate4(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.ListIterator --- only for List implementations");
		ListIterator<Integer> lit = marks.listIterator();
		while(lit.hasNext()) {
			Integer n = lit.next();
			System.out.print(n + "    ");
		}
		System.out.println();
		
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}	
	
	static void iterate5(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}	
}
