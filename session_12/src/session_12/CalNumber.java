package session_12;

public class CalNumber {

	public void fact(int no) {
		int f = 1;
		for(int i=1; i<no; i++) {
			f*= i;
		}
		System.out.println("Factorial of "+no+" is "+f);
	}
}
