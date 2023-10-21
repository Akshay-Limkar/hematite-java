package session_14;
import java.util.*;

public class MyComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		Integer a = o1;
		Integer b = o2;
		if(a<b)
			return +1;
		else if (a>b)
			return -1;
		else 
		return 0;
	}

}
