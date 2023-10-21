package Array;

public class MinMaxArray {
	
	public int MinArr(int arr[]) {
	      int min = arr[0];
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]<min) {
	            min = arr[i];
	         }
	      }
	      return min;
	   }
	
	public int MaxArr(int arr[]) {
	      int max = 0;
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]>max) {
	            max = arr[i];
	         }
	      }
	      return max;
	   }

	public static void main(String[] args) {
		
		int arr[] = {11,2,3,4,5,6,45};
		MinMaxArray m = new MinMaxArray();
		m.MinArr(arr);
		System.out.println("Minimum array is : "+m.MinArr(arr));
		m.MaxArr(arr);
		System.out.println("Maximum array is : "+m.MaxArr(arr));

	}

}
