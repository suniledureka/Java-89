
public class StringMethods {

	public static void main(String[] args) {
		String name = "edureka limited";

		System.out.println("size = " + name.length());
		System.out.println("character @ 0 = " + name.charAt(0));
		//System.out.println("character @ 15 = " + name.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(e) = " + name.indexOf("e")); //0
		System.out.println("indexOf(e,1) = " + name.indexOf("e",1)); //4
		System.out.println("lastIndexOf(e) = " + name.lastIndexOf("e")); //13
		System.out.println("indexOf(z) = " + name.indexOf("z")); //-1
		System.out.println("indexOf(limited) = " + name.indexOf("limited")); //8
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replace('e', '*'));
		
		String str = "   sunil  joseph   ";
		System.out.println(str.length()); //19
		str = str.trim();
		System.out.println(str.length()); //13
	}
}
