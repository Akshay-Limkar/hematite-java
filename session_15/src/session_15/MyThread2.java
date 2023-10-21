package session_15;

public class MyThread2 extends Thread {

	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getId()+" "+Thread.currentThread().getName()+"-"+i+" "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	
	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

/*NORM_PRIORITY - 5
MAX_PRIORITY - 10
MIN_PRIORITY - 1

Range of Priority is = 1 - 10*/