import java.util.Scanner;

public class Array{
	
	public static void main(String args[]) {
		int no, val;
		int[] arr = {10,20,30,40,50};                        
  
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);             
		System.out.println("Enter the Nth Position : ");    
		no = sc.nextInt();
		
		if(no<= arr.length) {                              
		val = arr[no-1];                        
		System.out.println(val);                     
		}else {
		System.out.println("Wrong Position Entered...");
      }
}
}
