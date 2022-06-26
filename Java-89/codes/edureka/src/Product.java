public class Product {
	int productId;
	String productName;
	float productPrice;
	
	public Product(int productId, String productName, float productPrice) {		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	public static void main(String[] args) {
		Product product = new Product(101, "Mouse", 375.5f);
		System.out.println(product); //toString()
	}
}
