package assignment_02;
import java.util.Scanner;

public class MathOperation {

	public static void main(String[] args) {

		double X, Y, R=0;
		int choice, ans;
		do {
		System.out.println("Enter value of X and Y : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		X = sc.nextDouble();
		Y = sc.nextDouble();
		System.out.println("Enter your choice : \n1. ADD\t2. SUB\t3. MUL\t4. DIV\t5. EXIT");
		choice = sc.nextInt();
	
		switch(choice) {
		
			case 1 :
				R = X + Y;
				System.out.println(X+"+"+Y+" = "+R);
				break;
				
			case 2 :
				if(X>Y) {
				R = X - Y;
				System.out.println(X+"-"+Y+" = "+R);
				}else {
					R = Y - X;
					System.out.println(Y+"-"+X+" = "+R);
				}
				break;
				
			case 3 :
				R = X * Y;
				System.out.println(X+"*"+Y+" = "+R);
				break;
				
			case 4 :
				if(Y==0) {
					System.out.println("Denominator should not be zero ");
				}else {
					R = X/Y;
					System.out.println(X+"/"+Y+" = "+R);
				}
				break;
				
			case 5 :
				System.exit(0);
				break;
				
			default : 
				System.out.println("Wrong Choice ");
			}
		System.out.println("Do you want to continue (1/0)? ");
		ans = sc.nextInt();
		}while(ans!=0);
	}
	


}
