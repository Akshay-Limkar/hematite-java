import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int p1, i, count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check its prime or not :");
		p1 = sc.nextInt();

		for (i = 2; i < p1; i++) {
			if (p1 % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println(p1 + " is a prime number");
		else {
			System.out.println(p1 + " is not a prime number");
		}

	}

}