package session_09;

public class Parent extends Object {
	int a;
	
	public Parent() {
		System.out.println("Parent default constructor");
	}
	
	public Parent(int a) {
		System.out.println("Parent class parameterized constructor");
		this.a=a;
	}

}
