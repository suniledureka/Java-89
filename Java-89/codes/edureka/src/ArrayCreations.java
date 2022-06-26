
public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[8];
		marks[0] = 98;
		marks[1] = 76;
		System.out.println("size of array = " + marks.length);
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		float []salaries = new float[9];
		for(float sal : salaries) {
			System.out.print(sal+"   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[10];
		for(boolean stat :  status) {
			System.out.print(stat+"   ");
		}
	}

}
