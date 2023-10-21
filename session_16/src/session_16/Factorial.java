package session_16;

public class Factorial {

	public synchronized void Fact(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact*=i;
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Factorial of "+n+" ="+fact);
		}
	}
}
