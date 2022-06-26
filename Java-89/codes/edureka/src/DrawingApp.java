import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = null;
		
		System.out.print("enter the type of shape [1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		  case 1:
			sh = new Rectangle("blue", 12, 7);
			break;
		  case 2:
			sh = new Circle("yellow", 12.5f);
			break;
		  default:
			System.out.println("$$$--- Invalid Shape Selected ... Try Again ---$$$");
			return;
		}//switch
		
		System.out.println("Shape selected ---> " + sh.getClass().getName().toUpperCase());
		
		System.out.println("color of "+sh.getClass().getName()+ " = " + sh.getColor());
		sh.area();
	}

}
