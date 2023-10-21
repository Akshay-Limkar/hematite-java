package session_13;

public class Test {
	
	public static void getMsg() {
		msg();
	}
	
	public static void msg() {
		int div = 10/0; //Arithmetic Exception
	}
	
	public static void main(String[] args) {	
		Test.getMsg();
	}

}
