
public class StudentTest2 {

	public static void main(String[] args) {
		Student[] students=new Student[5];
		students[0]=new Student("Teju",2, 20,"12th", new int[]{45,23,56,78,98});
		students[1]=new Student("Bharathi",3, 24,"11th", new int[]{65,53,96,88,98});
		students[2]=new Student("Ramya",4 , 23,"10th", new int[]{85,23,56,78,98});
		students[3]=new Student("Ranga",5, 22,"9th", new int[]{95,45,32,34,67});
		students[4]=new Student("Ram",6 , 21,"12th", new int[]{79,76,97,89,98});
		students[0].display(students[0]);
		students[1].display(students[1]);
		students[2].display(students[2]);
		students[3].display(students[3]);
		students[4].display(students[4]);
	}

}
