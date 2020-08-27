import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.interfaces.EmpIOImpl;
import com.interfaces.EmployeeOperationsImpl;
import com.pojo.Employee;

public class EmployeeTest {
	public static void main(String [] args){
		List<Employee> employees=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		EmpIOImpl eio=new EmpIOImpl();
		EmployeeOperationsImpl eo=new EmployeeOperationsImpl();
		Employee e=new Employee();
		int op;
		do{
		System.out.println("Enter your option \n1.Add Employee \n2.Update Employee \n3.FineEmployeeById \n 4.Find all \n5.Delete employee\n6.exit");
		op=sc.nextInt();
		switch(op){
		case 1:
			e=eio.readFromUser();
			eo.addEmployee(e);
			break;
		case 2:
			System.out.println("Enter emp id and name\n");
			e=eo.updateEmployee(sc.nextInt(), sc.next());
			if(e==null){
				System.out.println("Employee not found for update!!!");
			}
			else{
				System.out.println("Employee details successfully updated!!!");
			}
			break;
		case 3:
			System.out.println("Enter id to find ");
			e=eo.findEmployeeById(sc.nextInt());
			if(e==null){
				System.out.println("Employee not found by the provided Id!!");
			}
			else{
				System.out.println("Employee found!!!");
			}
			break;
		case 4:
			employees=eo.findAllEmployees();
			employees.forEach(System.out ::println);
			break;
		case 5:
			System.out.println("Enter empId to delete ");
			e=eo.deleteEmployee(sc.nextInt());
			if(e==null){
				System.out.println("Employee not found to delete !!!");
			}
			else{
				System.out.println("Employee deleted successfully!!!");
			}
			break;
		case 6:
			System.out.println("You are successfully exited!!!");
			System.exit(0);
		default:
			System.out.println("Choose correct option!!");
			
		}
		}while(true);
	}

}
