package co.edureka.util;

import java.util.Hashtable;
import java.util.Map;

public class BankMap3 {

	public static void main(String[] args) {
		Map<String,Float> bank = new Hashtable<String,Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Arun", 12500f)); //null		
		bank.put("Rahul", 12750f);
		bank.put("Praveen", 22750f);
		bank.put("Charles", 32750f);
		
		System.out.println(bank);
		bank.put("Sanjay", null);
		System.out.println(bank);
	}

}
