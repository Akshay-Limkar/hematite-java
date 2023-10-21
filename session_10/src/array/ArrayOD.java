package array;
import java.util.Scanner;
public class ArrayOD {

	public static void main(String[] args) {
		
		int size;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" element : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
