package session_13;

public class Demo1 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
