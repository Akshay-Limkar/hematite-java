import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		int n1, n2, n3;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers to swap : ");

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.println("Before Swap : " + n1 + " & " + n2);
		n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("After Swap : " + n1 + " & " + n2);

	}

}