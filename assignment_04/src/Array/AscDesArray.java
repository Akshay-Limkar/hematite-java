package Array;
import java.util.*;

public class AscDesArray {
	
	public void AscArr(int arr[]) {
		Arrays.sort(arr);
		System.out.println("Sorted array by Ascending Order : ");
		for (int i = 0; i < arr.length; i++) {       
		System.out.print(arr[i]+"\t"); 
		}
		System.out.println();
	}
	
	public void DesArr(int arr[]) {
//		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted array by Descending Order : ");
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}

	public static void main(String[] args) {
		
		int[] arr = {11,20,32,14,5,16,4};
		AscDesArray m = new AscDesArray();
		m.AscArr(arr);
		m.DesArr(arr);
	}

}
