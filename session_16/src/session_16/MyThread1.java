package session_16;

public class MyThread1 extends Thread{

	Factorial f;
	public MyThread1(Factorial f) {
		super();
		this.f = f;
	}
	public void run() {
		f.Fact(5);
	}
}
