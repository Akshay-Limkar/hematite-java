package session_14;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add(null);
		a.add(44);
		a.add("A");
		System.out.println(a);

		a.remove(2);
		System.out.println(a);
		
		a.add(2,"Akshay");
		System.out.println(a);
	}

}
