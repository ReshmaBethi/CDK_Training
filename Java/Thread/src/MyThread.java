
public class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside thread : "+Thread.currentThread().getName()+" : "+i);
		}
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());
		MyThread  m=new MyThread();
		m.setName("One");
		m.start();
		
//		MyThread m1=new MyThread();
//		m1.setName("two");
//		m1.run();
		
		System.out.println("At the end of main");
		
	}

}
