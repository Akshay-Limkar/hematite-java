package assignment_02;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
			double ans, radius, pi = 3.14;
		
			System.out.println("Enter radius of Circle : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			radius = sc.nextFloat();
			
			ans = pi * (radius*radius);
			System.out.println("Area of Circle is = "+ans);
	}

}
