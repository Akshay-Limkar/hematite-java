package session_12A;

public class Outer {

//	private int no = 10;
	
	class Inner {
		int no = 100;
		public void get() {
			System.out.println("No = "+no);
		}
	}
	public void getData() {
		Inner i = new Inner();
		i.get();
	}
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		/*Inner i = o.new Inner();
		i.get();*/ 
		o.getData();

	}

}
