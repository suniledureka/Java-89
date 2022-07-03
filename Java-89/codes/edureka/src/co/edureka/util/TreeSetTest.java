package co.edureka.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		//Set<String> names = new TreeSet<String>();
		TreeSet<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Sujith")); //true
		System.out.println(names.add("Sujith")); //false
		names.add("Shankar");
		names.add("Praveen");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names);
		
		Set<String> descNames = names.descendingSet();
		System.out.println(descNames);
	}

}
