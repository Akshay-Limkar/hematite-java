package session_11;

public class DemoString {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = new String ("Java");
		String s3 = "Java";
		String s4 = "java";
		String s5 = " java";
		
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s4)); //false
		
		System.out.println(s4.compareTo(s5));
	}

}
