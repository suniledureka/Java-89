
public class TernaryOperator {

	public static void main(String[] args) {
		int x = 100;
		int y = 20;
		int lar;
		
		/*
		if(x > y) {
			lar = x;
		}
		else {
			lar = y;
		}
		*/
		lar = (x > y)?x:y;
				
		System.out.println("largest = " + lar);
	}

}
