package assignment_07;

public class Voter {
	
	int voterID, age;
	String name;
	
	public Voter(int voterID, int age, String name) {
		this.voterID = voterID;
		this.age = age;
		this.name = name;
		 
		if(age<18) {
			try {
			throw new Exception();
			}catch(Exception e) {
				System.out.println("Invalid age for Voter");
			}
		}
	}

	public String toString() {
		return "Voter [voterID=" + voterID + ", age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		Voter v1 = new Voter(111,25,"Akshay");
		Voter v2 = new Voter(112,17,"Gaurav");
		Voter v3 = new Voter(113,26,"Shubham");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
