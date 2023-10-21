package campus.app;

import java.util.Scanner;

import campus.academics.Faculty;

public class CampusApp extends Faculty {

	public static void main(String[] args) {
		
		System.out.println("Enter 5 Faculty Info :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println(name);
	}

}
