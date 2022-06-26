package co.edureka;

public class WrapperTest {

	public static void main(String[] args) {
		Integer n1 = new Integer(12);
		Integer n2 = new Integer("12");
		Integer n3 = Integer.valueOf(12);
		Integer n4 = Integer.valueOf("12");
		System.out.println(n1+" | " + n2+" | " + n3+" | " + n4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1+" | " + c2);
		
		byte b = n1.byteValue();
		short s = n1.shortValue();
		int n = n1.intValue();
		long l = n1.longValue();
		
		float f = n1.floatValue();
		double d = n1.doubleValue();
		
		System.out.println(b+" | " + s+" | " + n+" | " + l);
		System.out.println(f+" | " + d);
	}

}
