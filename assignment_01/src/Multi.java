import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {

		int no1, no2, no3;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers : ");

		no1 = sc.nextInt();
		no2 = sc.nextInt();

		no3 = no1 * no2;
		System.out.println("The multiplication of two no is : " + no3);
	}

}