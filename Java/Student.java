
public class Student {
	private String name;
	private int id;
	private int age;
	private String standard;
	private int[] marks;
	private int total;
	public Student(){
		
	}
	public Student(String name, int id, int age, String standard,int[] marks){
		this.name=name;
		this.id=id;
		this.age=age;
		this.standard=standard;
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void display(Student student){
		System.out.println("Name "+student.getName()+"\nId: "+student.getId()+"\nAge :"+student.getAge()+"\nStandard :"+student.getStandard());
		System.out.println("Subject wise marks are :");
		for(int marks1:marks){
			System.out.print(marks1+"\t");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
