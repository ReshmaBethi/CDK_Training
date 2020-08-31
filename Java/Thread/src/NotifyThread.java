
public class NotifyThread extends Thread{
	public static int total=0;
	int x,y;
	public NotifyThread(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		total=x+y;
		
		synchronized (this) {
			notify();
		}
	}

}
