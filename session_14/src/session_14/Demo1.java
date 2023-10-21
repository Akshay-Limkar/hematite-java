package session_14;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList<>();
		l.add("Akshay");
		l.add('a');
		l.add(78);
		l.add("Akshay");
		l.add(null);
		System.out.println(l);
		
		l.set(3, "Gaurav");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst("Shubham");
		System.out.println(l);

	}

}
