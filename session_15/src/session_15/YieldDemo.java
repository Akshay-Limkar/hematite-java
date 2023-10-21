package session_15;

public class YieldDemo implements Runnable {
	
	public void run() {
		for(int x=1; x<=4; x++) {
			if(x==2) {
				Thread.yield();
			}else {
				System.out.println(x+" "+Thread.currentThread().getName());
			}
		}
	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new YieldDemo());
		Thread t2 = new Thread(new YieldDemo());
		Thread t3 = new Thread(new YieldDemo());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
