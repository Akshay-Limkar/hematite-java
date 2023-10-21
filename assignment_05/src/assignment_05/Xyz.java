package assignment_05;
import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		
		int pId, quantity;
		double price;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Products Information: ");
		
		int arr[] = new int[5];
		System.out.println("Enter Product ID: ");
		pId = sc.nextInt();
		System.out.println("Enter Quantity: ");
		quantity = sc.nextInt();
		System.out.println("Enter Product Price: ");
		price = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		/*int arr[] = new int[5];
		System.out.println("Enter Product ID: ");
		pId = sc.nextInt();
		System.out.println("Enter Quantity: ");
		quantity = sc.nextInt();
		System.out.println("Enter Product Price: ");
		price = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();*/
//		}
	
	}

}
