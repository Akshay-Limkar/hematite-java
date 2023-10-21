import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
	
				int i,no, fact=1;
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Entere any number : ");
				no = sc.nextInt();
				
				for(i=1; i<=no; i++)
				{
					fact = fact*i;
				}
				System.out.println("Factorial of "+no+"="+fact);
			
	}

}
