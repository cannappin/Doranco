import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	private static ReentrantLock lock = new ReentrantLock();
	
	static class Producer implements Runnable{
	    private List<Object> buffer;
	    
	    public Producer(List<Object> buffer) {
	        this.buffer = buffer;
	    }


	    @Override
	    public void run() {
		        for (int i=0;i<100;i++){
		        	lock.lock();
		            buffer.add(i);
		            System.out.println(Thread.currentThread().getName()+" added "+i);
		            lock.unlock();
		        }
		        
		        System.out.println(Thread.currentThread().getName()+" added "+EOF);
		        buffer.add(EOF);
	    }
	}
	
	static class Consumer implements Runnable{
	    private List<Object> buffer;

	    public Consumer(List<Object> buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {	    	
	        while (true){
	        	lock.lock();
		            if (buffer.isEmpty()){
		            	lock.unlock();
		            	continue;
		            }
		            if (buffer.get(0).equals(EOF)){
		                System.out.println(Thread.currentThread().getName()+" exiting.");
		                lock.unlock();
		                break;
		            } else {
		                System.out.println(Thread.currentThread().getName()+ " removed " +buffer.remove(0));
		            }
		        lock.unlock();
	        }
	    }
	}
	
	
	public static final String EOF = "EOF";
	    public static void main(String[] args) {
	    	List<Object> buffer = new ArrayList<>();

	        Thread producerThread = new Thread(new Producer(buffer));
	        producerThread.setName("producerThread");

	        Thread consumerThread1 = new Thread(new Consumer(buffer));
	        consumerThread1.setName("consumerThread1");

	        Thread consumerThread2 = new Thread(new Consumer(buffer));
	        consumerThread2.setName("consumerThread2");

	        producerThread.start();
	        consumerThread1.start();
	        consumerThread2.start();
	    }

}
