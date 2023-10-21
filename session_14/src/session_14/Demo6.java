package session_14;
import java.util.*;

public class Demo6 {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("akshay");
		l.add("gaurav");
		l.add("shubham");
		l.add("ranjit");
		l.add("swaraj");
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.equals("akshay"))
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}

}
