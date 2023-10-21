package session_12A;

public class Outer2 {

//	private int no = 10;
	private static int x = 200;
	
	public static class Inner{
		public void m1() {
//			System.out.println("No = "+no); // Only Static member access
			System.out.println("X = "+x);
		}
	}
	
	public static void main(String[] args) {
		
		Outer2.Inner i = new Outer2.Inner();
		i.m1();
	}

}
