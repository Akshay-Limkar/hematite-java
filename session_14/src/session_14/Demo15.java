package session_14;

import java.util.PriorityQueue;

public class Demo15 {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>(new MyComparator1());
		q.offer("A");
		q.offer("S");
		q.offer("L");
		q.offer("Z");
		System.out.println(q);

	}

}
