package session_15;

public class MyThread extends Thread {
	
	public void run() { //resource //running
		System.out.println("Thread : "+Thread.currentThread().getName());
	}
	//dead state

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start(); //runnable
	}

}
