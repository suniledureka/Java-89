
public class NaturalNumbers2 {

	public static void main(String[] args) {
		System.out.println("First 10 Natural Numbers are:");
		
		int n = 1;
		
		while(n <= 10)
		{
			if(n == 10) {
				System.out.println(n);
			}
			else {
				System.out.print(n+", ");
			}
			
			n++;
		} //while
	} //main
}//class
