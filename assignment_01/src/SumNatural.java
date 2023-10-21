import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {

		int n1, n2 = 0, i;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any natural number : ");
		n1 = sc.nextInt();

		for (i = 1; i <= n1; i++) {
			n2 = n2 + i;
		}
		System.out.println("Sum of " + n1 + "th natural number is : " + n2);

	}

}