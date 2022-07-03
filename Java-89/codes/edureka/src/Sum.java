import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int no1 = sc.nextInt();
		
		System.out.print("enter second no: ");
		int no2 = sc.nextInt();
		
		int sum = no1 + no2;
		
		System.out.println("sum = " + sum);
		System.out.println(no1 + " + " + no2 + " = " + sum);
	}

}
