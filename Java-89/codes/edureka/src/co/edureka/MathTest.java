package co.edureka;
import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(sin(0));
		System.out.println(cos(0));
		System.out.println(sqrt(9));
		System.out.println(round(10.657));
		System.out.println(ceil(10.3)); //11.0
		System.out.println(floor(10.3)); //10.0
		
		double random = random();
		System.out.println(random);
		int otp = (int)(random* 10000);
		System.out.println("OTP = " + otp);
	}
}
