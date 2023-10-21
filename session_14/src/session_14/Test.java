package session_14;

public class Test {

	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(no); // boxing - primitive to wrapper
		int a = i.intValue(); // unboxing - wrapper to primitive
		System.out.println(a);
		
		int b = 11;
		Integer s = b; //auto-boxing
		int c = s; //auto-unboxing
		System.out.println(c);
	}

}
