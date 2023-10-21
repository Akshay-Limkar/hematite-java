package session_12A;

public class Student {
	
	int rn;
	String nm;
	
	public Student(int rn, String nm) {
		super();
		this.rn=rn;
		this.nm=nm;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student(111,"Akshay");
		Student s2 = (Student) s1.clone();
		
		System.out.println(s1.rn+" "+s1.nm);
		System.out.println(s2.rn+" "+s2.nm);
	}

}
