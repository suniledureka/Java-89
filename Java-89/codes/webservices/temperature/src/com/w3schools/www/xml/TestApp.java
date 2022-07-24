package com.w3schools.www.xml;

public class TestApp {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator(); 
		TempConvertSoap ref = locator.getTempConvertSoap();
		
		String cel = "36";
		String fah = ref.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = " + fah+"F");
		
		cel = ref.fahrenheitToCelsius(fah);
		System.out.println(cel+"C = " + fah+"F");
	}

}
