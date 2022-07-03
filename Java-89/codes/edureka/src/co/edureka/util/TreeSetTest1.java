package co.edureka.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>(new MyComparator());
				
		names.add("Sujith"); 		
		names.add("Shankar");
		names.add("Praveen");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names);
	}
}

class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {			
		//return -1;
		//return o1.compareTo(o2);
		return o2.compareTo(o1);
	}		
}
