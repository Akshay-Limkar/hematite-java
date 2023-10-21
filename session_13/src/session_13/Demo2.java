package session_13;

public class Demo2 {

	public static void main(String[] args) {
		
		A a = new A();
		double d = a.div(2, 5);
		
		if(d<1) {
			try {
				throw new MyException();
			}catch(MyException e) {
				System.out.println(e);
			}
		}

	}

}
