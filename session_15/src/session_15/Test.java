package session_15;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

	}

}
