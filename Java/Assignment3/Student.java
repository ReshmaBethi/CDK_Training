
public class Student {
	private int rollNo;
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo,String name) {
		// TODO Auto-generated constructor stub
		this.rollNo=rollNo;
		this.name=name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return rollNo+"\t"+name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student student=(Student)obj;
		
		return this.getRollNo()==student.getRollNo() && this.getName().equals(student.getName());
	}
	
}
