
public class SBTest {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb+" |Size="+sb.length() + " |Capacity="+sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb+" |Size="+sb.length() + " |Capacity="+sb.capacity());
		
		sb.insert(0, "** ");
		System.out.println(sb+" |Size="+sb.length() + " |Capacity="+sb.capacity());
	}

}
