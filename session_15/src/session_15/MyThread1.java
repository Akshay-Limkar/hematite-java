package session_15;

public class MyThread1 extends Demo implements Runnable {
	
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getName()+""
					+ "-"+i);
		}
	}

	public static void main(String[] args) {
		
		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		MyThread1 m2 = new MyThread1();
		Thread t2 = new Thread(m2);
		MyThread1 m3 = new MyThread1();
		Thread t3 = new Thread(m3);
		
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
