
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		
		//long pop = 2147483647;
		long pop = 2147483648L;
		System.out.println("world population = " + pop);
		
		int n = (int)12L; //typecasting
		System.out.println(n);
		
		//byte s = (byte)128;
		//byte s = (byte)356;
		byte s = (byte)1000;
		System.out.println(s);
	}

}
