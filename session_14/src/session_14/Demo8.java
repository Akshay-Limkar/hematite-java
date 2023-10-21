package session_14;

import java.util.TreeSet;

public class Demo8 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		
		t.add("D");
		t.add("e");
//		System.out.println(t.add(10)); //ClassCastException
//		t.add(null); //NullPointerException
		t.add("A");
		t.add("Z");
		t.add("Z");
		
		System.out.println(t);
	}

}
