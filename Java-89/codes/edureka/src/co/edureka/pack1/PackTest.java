package co.edureka.pack1;

import co.edureka.pack2.Nums;

public class PackTest {

	public static void main(String[] args) {
		System.out.println("package example");
		
		Nums obj = new Nums();
		
		obj.add(10, 20);
		System.out.println("diff = " + obj.sub(10.5f, 12.3f));
	}

}
