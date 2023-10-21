import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check its Even or Odd : ");
		num = sc.nextInt();

		if ((num % 2) == 0) {
			System.out.println("The number " + num + " is Even");
		} else {
			System.out.println("The number " + num + " is Odd");
		}

	}

}