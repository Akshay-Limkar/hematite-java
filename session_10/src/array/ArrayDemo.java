package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		/*int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;*/
		
//		int []arr = {1,2,3,4,5,6};
		
		int[] arr = new int[] {11,22,33};
		
		/*for(int a:arr) {
			System.out.print(a+"\t");
		}*/
		
		System.out.println("Length of an Array : "+arr.length);
		for(int i=0; i<=arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
