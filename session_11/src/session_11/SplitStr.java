package session_11;

public class SplitStr {

	public static void main(String[] args) {
		
		String str = "Java is an object oriented language";
		
		String[] s = str.split("o");
		
		for(String s1:s) {
			System.out.println(s1);
		}

	}

}
