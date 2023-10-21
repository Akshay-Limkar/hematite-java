package session_08;

public class B extends A {

	int no1 = 12;
	public void m1() {
		System.out.println("In m1() of B");
	}
	public void m2() {
		System.out.println("In m2() of B");
	}
	
	public static void main(String[] args) {
	
		A b = new B();
		((B) b).m2();

	}

}