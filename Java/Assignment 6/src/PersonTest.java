import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exceptions.PersonNotFoundException;
import com.interfaces.PersonIoImpl;
import com.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Person> persons=new ArrayList<Person>();
		PersonIoImpl pi=new PersonIoImpl();
		persons=pi.getPersons();
		int id;
		try{
		do{
		System.out.println("Enter your option 1.Add Person \n 2. Update Person \n3.Find Person \n4.Display");
		int op=sc.nextInt();
		switch(op){
		case 1 :
			System.out.println("Enter the id and name : ");
			Person person=new Person(sc.nextInt(),sc.next());
			pi.addPerson(persons, person);
			break;
		case 2:
			System.out.println("Enter id to update : ");
			id=sc.nextInt();
			if(pi.updatePerson(id, persons)==null){
					throw new PersonNotFoundException("Person Not found For update ");
			}
			else{
				System.out.println("Person updated Successfully!!!");
			}
			break;
		case 3:
			System.out.println("Enter id to find ");
			id=sc.nextInt();
			if(pi.findById(id, persons)==null){
					throw new PersonNotFoundException("Person not found By Id ");
			}
			else{
				System.out.println("Person found");
			}
			break;
		case 4:
			pi.displayPersons();
			break;
		case 5:
			System.out.println("You are successfully exited !!!");
			System.exit(0);
		default :
			System.out.println("Please choose correct option ");
		}
		}while(true);
		
	}catch(PersonNotFoundException e){
		e.display();
	}
		
	}

}
