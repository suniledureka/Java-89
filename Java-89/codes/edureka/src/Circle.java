
public class Circle extends Shape {
	float radius;
	Circle(String color, float radius){
		super(color);
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("area of circle = " + (Math.PI * Math.pow(radius, 2)));
	}

}
