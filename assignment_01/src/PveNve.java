import java.util.Scanner;

public class PveNve {

	public static void main(String[] args) {

		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println(num + " is a positive number");
		} else {
			System.out.println(num + " is a negetive number");
		}

	}

}