package assignment_02;
public class MulOperation {

	public void Multiply(int a, int b) {
		System.out.println("Multiplication of two int :"+(a*b));
	}
	
	public void Multiply(float x, float y, float z) {
		System.out.println("Multiplication of three float :"+(x*y*z));
	}
	
	public void Multiply(int c, double d) {
		System.out.println("Multiplication of one int and one float :"+(c*d));
	}
	
//	public static void Multiply(int arr[]) {
//		for(int i=0; i<arr.length; i++){
//	    arr[i] = i;
//	    int product = product * arr[i];
//		System.out.println("Multiplication of array :"+product);
//		}
//	}
	
	public static void main(String[] args) {
		MulOperation op = new MulOperation();
		
		op.Multiply(6,8);
		op.Multiply(6.1f,8.3f,6.6f);
		op.Multiply(6,8.99);
//		int arr[] = { 5, 7, 2, 4, 9, 6 };
//		Multiply(arr);

	}

}
