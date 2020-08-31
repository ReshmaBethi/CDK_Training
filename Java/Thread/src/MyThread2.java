
public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("name : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		
		Thread thread=new MyThread2();
//		thread.setPriority(MAX_PRIORITY);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
		
	}

}
