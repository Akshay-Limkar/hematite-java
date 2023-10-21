package session_12A;

public class Outer1 {

	private int no = 10;
	
	public void m() {
//		int no = 100;
		class Inner{
			void show() {
				System.out.println("The value of No = "+no);
			}
		}
		Inner i = new Inner();
		i.show();
	}
	
	public static void main(String[] args) {
		
		Outer1 o = new Outer1();
		o.m();
	}

}
