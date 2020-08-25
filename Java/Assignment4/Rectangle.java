
public class Rectangle extends Shape implements Calculatable {
	private double height;
	private double width;
	public Rectangle(){
		
	}
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*height*width;
	}

}
