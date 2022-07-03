package co.edureka.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Sujith")); //true
		System.out.println(names.add("Sujith")); //false
		names.add("Shankar");
		names.add("Praveen");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names);
	}
}
