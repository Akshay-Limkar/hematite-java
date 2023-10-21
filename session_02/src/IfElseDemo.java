import java.util.Scanner;
public class IfElseDemo {

	public static void main(String[] args) {
		int a, b, c;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 3 Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Entered Numbers : "+a+","+b+","+c);
		
		if((a>b) && (a>c))
		{
			System.out.println(a+" is Greater No");
		}
		else if ((b>a) && (b>c)) 
			System.out.println(b+" is Greater No");
		else
			System.out.println(c+" is Greater No");
	}

}
