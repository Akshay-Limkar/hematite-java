package session_15;

public class JoinDemo implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo j1 = new JoinDemo();
		Thread t1 = new Thread(j1,"1");
		Thread t2 = new Thread(j1,"2");
		Thread t3 = new Thread(j1,"3");

		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
	}
	public void run() {
		for(int x=1; x<=3; x++) {
			System.out.println("This is Thread"+Thread.currentThread().getName());
		}
	}
	
}
