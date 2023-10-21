package session_10;

import java.util.Scanner;

public class Person {

	private String fname, lname;
	private int age;
	protected Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("Enter first name : ");
		fname = sc.next();
		System.out.println("Enter last name : ");
		lname = sc.next();
		System.out.println("Enter age : ");
		age = sc.nextInt();
	}
	
	public void show() {
		System.out.println("Name : "+fname+" "+lname+" Age : "+age);
	}

}
