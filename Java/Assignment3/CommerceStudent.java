
public class CommerceStudent extends Student {
	private String majorSubject;
	private String collegeName;
	public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(int rollNo,String name,String majorSubject,String collegeName) {
		// TODO Auto-generated constructor stub
		super(rollNo,name);
		this.majorSubject=majorSubject;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return majorSubject+"\t"+collegeName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CommerceStudent student= (CommerceStudent)obj;
		return super.equals(student) && this.getMajorSubject().equals(student.getMajorSubject()) && this.getCollegeName().equals(student.getCollegeName());
	}
	public String getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}
