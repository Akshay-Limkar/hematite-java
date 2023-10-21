package session_09;

public class Child extends Parent {
	
	int no;
	
	public Child() {
		System.out.println("Child default constructor");
	}
	
	public Child(int no) {
		super(11);
		System.out.println("Child class parameterized constructor");
		this.no=no;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Child c = new Child(10);

	}

}
