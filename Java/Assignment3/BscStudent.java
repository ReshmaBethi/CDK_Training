
public class BscStudent extends Student {
	private String specialization;
	private String collegeName;
	public BscStudent() {
		// TODO Auto-generated constructor stub
	}
	public BscStudent(int rollNo,String name,String specialization,String collegeName) {
		// TODO Auto-generated constructor stub
		super(rollNo,name);
		this.specialization=specialization;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specialization+"\t"+collegeName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		BscStudent student= (BscStudent)obj;
		return super.equals(student) && this.getSpecialization().equals(student.getSpecialization()) && this.getCollegeName().equals(student.getCollegeName());
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}
