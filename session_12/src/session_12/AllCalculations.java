package session_12;

public class AllCalculations extends CalNumber implements StaticCal, CompareCal {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition is = "+c);
	}
	
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("Subtraction is = "+c);
	}
	
	public void min(int a, int b) {
		int c = (a<b)?a:b;
		System.out.println("Minimum is = "+c);
	}
	
	public void avg(int a, int b) {
		float c = ((float)(a+b)/2);
		System.out.println("Avarage is = "+c);
	}
	
}
