package session_14;

import java.util.HashSet;

public class Demo7 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("Z");
		h.add("z");
		h.add("A");
		h.add(null);
		h.add(10);
		
		System.out.println(h);
		System.out.println(h.add(10)); //false
		System.out.println(h);

	}

}
