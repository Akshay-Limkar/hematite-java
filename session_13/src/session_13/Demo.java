package session_13;

public class Demo {

	public static void main(String[] args) {
		
		int a,b,c = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("Division is = "+c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Error");
		}

	}

}
