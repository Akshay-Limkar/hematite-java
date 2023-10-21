package session_15;

public class DaemonThread extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+" is Daemon Thread");
		}else {
			System.out.println(Thread.currentThread().getName()+" not a Daemon Thread");
		}
	}

	public static void main(String[] args) {
		
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

}
