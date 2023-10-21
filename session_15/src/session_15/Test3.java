package session_15;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg,"Child Group");
		MyThread3 t1 = new MyThread3(pg,"One");
		MyThread3 t2 = new MyThread3(pg,"Two");
		
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		
	}

}
