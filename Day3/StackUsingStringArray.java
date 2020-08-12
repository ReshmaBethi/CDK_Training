import java.util.Scanner;

class Stack{
	int top=-1;
	int count=10;
	String[] arr=new String[count];
	public void push(String item) {
		if(top==count-1)
		{
			System.out.println("Stack is full!!!");
		}
		else
		{
			arr[++top]=item;
			System.out.println("The item successfully inserted1!!!");
		}
	}
	public String pop() {
		
			return arr[top--];
	}
	public void top()
	{
		System.out.println("The top element is "+arr[top]);
	}
	public void isEmpty()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
	}
	public void display()
	{
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("The elements in stack are :");
			for(int i=0;i<=top;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		while(true) {
		System.out.println("Enter your option\n1.push    2.pop      3.top   4.isEmpty    5.display   6.Exit");
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("ENter your element to push");
			s.push(sc.next());
			break;
		case 2:
			String a = s.pop();
			System.out.println("The popped element is "+a);
			break;
		case 3:
			s.top();
			break;
		case 4:
			s.isEmpty();
			break;
		case 5:
			s.display();
		case 6:
			System.exit(0);
		}
	}
	}

}
