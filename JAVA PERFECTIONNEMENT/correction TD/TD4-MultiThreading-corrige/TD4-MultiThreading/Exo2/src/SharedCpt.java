import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedCpt {

	static int cpt = 0;
	private static Lock lock = new ReentrantLock();
	public static void main(String[] args) {
		new Thread(new MyThread("Thread1")).start();
		new Thread(new MyThread("Thread2")).start();
	}
	
	static class MyThread implements Runnable{
		String name;
		public MyThread(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			while(true) {  
				lock.lock();
				try {
					System.out.println(name+" "+cpt++);
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	}
}
