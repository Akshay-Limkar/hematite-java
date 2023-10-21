import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {

		int no1, no2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no1 = sc.nextInt();

		no2 = (no1 * no1) * no1;
		System.out.println("Cube of " + no1 + " is : " + no2);

	}

}