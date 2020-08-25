
public class TestStudents {
	public static boolean search(Student[] students,Student student){
		for(Student student1 : students){
				if(student1.getClass()==student.getClass()){
					if(student1.equals(student)){
						return true;
					}
				}
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] students=new Student[7];
		students[0]=new EnggStudent(1,"Reshma","CSE","RGUKT");
		students[1]=new EnggStudent(2,"Bharathi","CSE","Martin");
		students[2]=new EnggStudent(3,"Swathi","CSE","Layola");
		students[3]=new BscStudent(4,"Ramya","Genetics","MallaReddy");
		students[4]=new BscStudent(6,"Srujan","Optometry","Sridevi");
		students[5]=new CommerceStudent(5,"Vishnu","Accountancy","ABC");
		students[6]=new CommerceStudent(7,"Swarali","Economics","XYZ");
		
		CommerceStudent cStudent=new CommerceStudent(7,"Swarali","Economics","XYZ");
		if(search(students,cStudent)){
			System.out.println("Student found");
		}
		else{
			System.out.println("Student not found");
		}
		EnggStudent eStudent=new EnggStudent(8,"Ram","ECE","RGUKT");
		if(search(students,eStudent)){
			System.out.println("Student found");
		}
		else{
			System.out.println("Student not found");
		}
	}

}
