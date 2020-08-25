
public class Shape {
	private String name;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
