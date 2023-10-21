package session_14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo12 {

	public static void main(String[] args) {
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		
		m.put("Nikhil", 100);
		m.put("Sonali", 200);
		m.put("Trupti", 300);
		m.put("Akshay", 100);
		m.put("Gaurav", 400);
		System.out.println(m);
		
		System.out.println(m.put("Akshay", 500));
		System.out.println(m);
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);

		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey()+"-"+m1.getValue());
			
			if(m1.getKey().equals("Sonali")) {
				m1.setValue(1000);
			}
		}
		System.out.println(m);
	}

}
