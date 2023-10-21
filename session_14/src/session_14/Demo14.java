package session_14;

import java.util.Hashtable;

public class Demo14 {

	public static void main(String[] args) {
		
		Hashtable t = new Hashtable();
		t.put(new Temp(5), "A");
		t.put(new Temp(2), "B");
		t.put(new Temp(6), "C");
		t.put(new Temp(15), "D");
		t.put(new Temp(23), "E");
		t.put(new Temp(16), "F");
		
		System.out.println(t);
	}

}
