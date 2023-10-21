package session_10;

public class HOD extends Teacher {

	private String dep;
	
	public void getData() {
		super.getData();
		System.out.println("Enter department : ");
		dep = sc.next();
	}
	
	public void show() {
		super.show();
		System.out.println("Department : "+dep);
	}
}
