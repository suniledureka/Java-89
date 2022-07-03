package co.edureka.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector<Integer> v = new Vector<Integer>();
		//Vector<Integer> v = new Vector<Integer>(5); //5-initial capacity
		Vector<Integer> v = new Vector<Integer>(5,3); //5-initial capacity, 3-capacity increment
		
		System.out.println(v + " | size = "+v.size() + " | capacity = " + v.capacity());
		
		for(int i=11;i<=20;i++) {
			v.add(i);
		}
		System.out.println(v + " | size = "+v.size() + " | capacity = " + v.capacity());
		
		v.add(21);
		System.out.println(v + " | size = "+v.size() + " | capacity = " + v.capacity());
		System.out.println();
		
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"    ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}

}
