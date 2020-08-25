
public class Circle extends Shape implements Calculatable {
	private double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}

}
