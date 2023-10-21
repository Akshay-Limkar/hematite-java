package session_10;

public class Teacher extends Person {

	private String sub;
	private int yrs_of_exp;
	
	public void getData() {
		super.getData();
		System.out.println("Enter subject : ");
		sub = sc.next();
		System.out.println("Enter years of experience : ");
		yrs_of_exp = sc.nextInt();
	}
	
	public void show() {
		super.show();
		System.out.println("Subject : "+sub+" Years of experience : "+yrs_of_exp);
	}
}
