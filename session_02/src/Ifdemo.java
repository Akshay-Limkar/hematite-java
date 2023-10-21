import java.util.Scanner;
public class Ifdemo {

	public static void main(String[] args) {
		int no;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numbers : ");
		no = sc .nextInt();
		System.out.println("Entered Numbers : "+no);
		
		if((no%2)== 0)
		{
			System.out.println("Given no is Even");
		}else
			System.out.println("Given no is Odd ");

	}

}
