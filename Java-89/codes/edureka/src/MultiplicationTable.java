import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which number's multiplication table? ");
		int num = sc.nextInt();
		
		printTable(num);
	}
	
	static void printTable(int n)
	{
		for(int i=1; i<=10; i++) {
			int p = n * i;
			System.out.println(n + " x " + i + " = " + p);
		}
	}
}
