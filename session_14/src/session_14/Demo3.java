package session_14;
import java.util.Stack;

public class Demo3 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("A");
		s.push("z");
		s.push("D");
		s.push("A");
		s.pop();
		
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search("z"));
		System.out.println(s.search("A")); //Duplicate not add
		System.out.println(s.search("D"));

	}

}
