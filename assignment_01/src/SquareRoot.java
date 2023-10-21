import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		double num, sr, num2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		num = sc.nextInt();

		sr = num / 2;
		do {
			num2 = sr;
			sr = (num2 + (num / num2)) / 2;
		} while ((num2 - sr) != 0);

		System.out.println("Square root of " + num + " is : " + sr);

	}

}
