
public class Talkative implements Runnable {

	private int id;
	
	
	public Talkative(int cpt) {
		this.id = cpt;
	}

	@Override
	public void run() {
		for(int i =0; i<100;i++) {
			System.out.println("thread "+id);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new Thread(new Talkative(i)).start();
		}
	}

}
