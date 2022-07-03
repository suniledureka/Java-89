package co.edureka;

public class CmdArgs {

	public static void main(String[] args) {
		System.out.println("no of cmd args = " + args.length);
		main(10,20);
	}
	public static void main(int n, int x) {
		System.out.println("overloaded main mmethod");
	}
}