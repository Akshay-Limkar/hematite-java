package session_13;

public class Test1 {
	
	public static void getMsg() {
		msg();
	}
	
	public static void msg() {
		try {
		int div = 10/0; //Arithmetic Exception
		}catch(Exception e) {
			System.out.println("Denominotor should not be zero");
		}
	}
	
	public static void main(String[] args) {
		Test1.getMsg();
//		System.out.println("Hello");
	}

}
