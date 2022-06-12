
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {92, 84, 76, 90, 82, 94};
		
		System.out.println("no of subjects = " + marks.length);
		
		//--- array iteration using normal for loop
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for Subject-"+(i+1)+" = " + marks[i]);
		}
		System.out.println();
		
		//--- array iteration using enhanced for loop
		System.out.print("marks obtained --->  ");
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[5]);
		System.out.println(marks[6]);//java.lang.ArrayIndexOutOfBoundsException
	}
}
