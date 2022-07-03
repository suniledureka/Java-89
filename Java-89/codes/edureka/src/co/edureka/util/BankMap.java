package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BankMap {

	public static void main(String[] args) throws InterruptedException {
		Map<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Arun", 12500f)); //null		
		bank.put("Rahul", 12750f);
		bank.put("Praveen", 22750f);
		bank.put("Charles", 32750f);
		
		System.out.println(bank);
		
		System.out.println("---------------------------------------------------------------");
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = " + bal);
		
		bal = bal+1150.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println("---------------------------------------------------------------");
		
		System.out.print("A/C Holders are -----> ");
		Set<String> keys = bank.keySet();
		for(String name : keys) {
			System.out.print(name + " | ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			Float balance = entry.getValue();
			
			String data = String.format("%-10s = %.2f", name, balance);
			System.out.println(data);
			Thread.sleep(1000);
		}
		System.out.println("---------------------------------------------------------------");
		
		bank.put(null, null);
		System.out.println(bank);
	}

}
