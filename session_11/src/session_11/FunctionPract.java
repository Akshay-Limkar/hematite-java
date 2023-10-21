package session_11;

public class FunctionPract {

	public static void main(String[] args) {

		String str = "My name is Akshay Limkar";
		String str1 = "Akshay";
		String str2 = "akshay";
		String str3 = "";
		String str4 = "    Hello World";
		
		char s = str.charAt(8); 
		System.out.println(s); //i
		
		System.out.println(str.contains("Aks")); //true
		System.out.println(str.contains("java")); //false
		
		System.out.println(str.equalsIgnoreCase(str1)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true

		System.out.println(str.isEmpty()); //false
		System.out.println(str3.isEmpty()); //true
		
		System.out.println(str.length()); //24
		
		System.out.println(str1.replace('k', 'c')); //Acshay
		
		System.out.println(str1.toUpperCase()); //AKSHAY
		System.out.println(str1.toLowerCase()); //akshay
		
		System.out.println(str4.trim()); //remove starting space
		
		System.out.println(str.substring(0,2)); //my
		
	}

}
