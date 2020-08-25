
public class StudentManipulation {
	
	public Student[] createStudents(){
		Student students[]=new Student[5];
		students[0]=new Student("Tejaswini",2, 20,"12th", new int[]{45,23,56,78,98});
		students[1]=new Student("Bharathi",3, 24,"11th", new int[]{65,53,96,88,98});
		students[2]=new Student("Ramya",4 , 23,"10th", new int[]{85,23,56,78,98});
		students[3]=new Student("Ranga",5, 22,"9th", new int[]{95,45,32,34,67});
		students[4]=new Student("Ram",6 , 21,"12th", new int[]{79,76,97,89,98});
		return students;
	}
	public int total(Student student){
		int total=0;
		for(int mark : student.getMarks()){
			total+=mark;
		}
		student.setTotal(total);
		return total;
	}
	public Student findMax(Student []students){
		Student maxStudent = null;
		int max=0;
		for(Student student: students){
			if(student.getTotal()>max){
				max=student.getTotal();
				maxStudent=student;
			}
		}
		return maxStudent;
		
	}

}
