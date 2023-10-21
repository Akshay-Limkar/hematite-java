import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		
		int a, b, c=0, ans;
		char choice;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter any two Number : ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("a.ADD\tb.SUB\tc.MUL\td.DIV\te.EXIT");
			choice = sc.next().charAt(0);
			
			switch(choice)
			{
			case 'a' :
				c = a+b;
				System.out.println(a+"+"+b+"="+c);
				break;
				
			case 'b' :
				if(a>b) {
				c = a-b;
				System.out.println(a+"-"+b+"="+c);
				}else
				c = b-a;
				System.out.println(b+"-"+a+"="+c);
				break;
				
			case 'c' :
				c = a*b;
				System.out.println(a+"*"+b+"="+c);
				break;
				
			case 'd' :
				if(b==0)
				{
					System.out.println("Denomitor should not be zero !!");
				}else
				{
				c = a/b;
				System.out.println(a+"/"+b+"="+c);
				break;
				}
			
			case 'e' :
				System.exit(0);
				break;
				
			default :
				System.out.println("Wrong Choice :");
		}
		System.out.println("Do you want to continue? : (1/0) ");
			ans = sc.nextInt();
		}while(ans!=0);

	}

}
