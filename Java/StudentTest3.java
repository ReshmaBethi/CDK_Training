
public class StudentTest3 {

	public static void main(String[] args) {
		StudentManipulation studentManipulation =new StudentManipulation();
		Student students[];
		students=studentManipulation.createStudents();
		int total=0;
		for(Student student:students){
			total=studentManipulation.total(student);
			student.display(student);
			System.out.println("Total Marks :"+total);
		}
		Student student=studentManipulation.findMax(students);
		System.out.println("The topper details are: ");
		student.display(student);
	}

}
