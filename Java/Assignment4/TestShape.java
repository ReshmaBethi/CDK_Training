
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(10);
		System.out.println("The area of Circle is : "+circle.area());
		System.out.println("The Perimeter of Circle is : "+circle.perimeter());
		
		Rectangle rectangle=new Rectangle(10,10);
		System.out.println("\nThe area of Rectangle is : "+rectangle.area());
		System.out.println("The perimeter of Rectangle is : "+rectangle.perimeter());
		
		Square square=new Square(50);
		System.out.println("\nThe area of Square is : "+square.area());
		System.out.println("The perimeter of Square is : "+square.perimeter());

	}

}
