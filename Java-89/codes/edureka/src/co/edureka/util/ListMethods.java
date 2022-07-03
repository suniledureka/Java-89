package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + " | size="+names.size());
		System.out.println("is names empty = " + names.isEmpty());
		
		names.add("Sunil");
		names.add("Praveen");
		names.add("Sunil");
		names.add("Sanjay");
		names.add("Sharath");
		names.add("Sunil");
		names.add("Sunil");
		
		System.out.println(names + " | size="+names.size());
		
		names.add(1, "Rahul");
		names.set(2, "PRAVEEN");
		System.out.println(names + " | size="+names.size());
		
		System.out.println("is \"Praveen\" in list = " + names.contains("Praveen"));
		
		System.out.println("indexOf(Sunil) ---> " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) ---> " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(edureka) ---> " + names.indexOf("edureka"));
		
		System.out.println("person @ index 0 ---> " + names.get(0));
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(0)); //Rahul
		
		System.out.println(names + " | size="+names.size());
	}

}
