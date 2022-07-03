package co.edureka.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Sujith")); //true
		System.out.println(names.add("Sujith")); //false
		names.add("Shankar");
		names.add("Praveen");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names);

	}

}
