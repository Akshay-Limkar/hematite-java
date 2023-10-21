package session_09;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("Akshay",25);
		age = 18;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person Name - "+name+" Age - "+age;
		
	}
	public static void main(String[] args) {
		
		Person obj = new Person();
//		Person obj = new Person("Gaurav",25);
		System.out.println(obj);
	}

}
