
public class EnggStudent extends Student {
	private String stream;
	private String collegeName;
	public EnggStudent() {
		// TODO Auto-generated constructor stub
	}
	public EnggStudent(int rollNo,String name,String stream,String collegeName) {
		// TODO Auto-generated constructor stub
		super(rollNo,name);
		this.stream=stream;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stream+"\t"+collegeName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		EnggStudent student= (EnggStudent)obj;
		return super.equals(student) && this.getStream().equals(student.getStream()) && this.getCollegeName().equals(student.getCollegeName());
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}
