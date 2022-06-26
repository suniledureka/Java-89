
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka"; 
		String s2 = "edureka";
		System.out.println(s1 == s2); //true
		
		String s3 = new String("java");
		String s4 = new String("JAva");
		System.out.println("s3 == s4 ----> "+(s3 == s4)); //false
		
		System.out.println("equals() ---> " + s3.equals(s4));
		System.out.println("equalsIgnoreCase() ---> " + s3.equalsIgnoreCase(s4));
		System.out.println("contentEquals() ---> " + s3.contentEquals(s4));
		
		//s1.concat(" limited");
		s1 = s1.concat(" limited");
		System.out.println(s1);
	}

}
