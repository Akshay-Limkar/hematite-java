import java.util.Scanner;
public class ForDemo {

	public static void main(String[] args) {
		int i,no;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere any number : ");
		no = sc.nextInt();
		
		for(i=1; i<=10; i++)
		{
			System.out.println(no+"*"+i+"="+(i*no));
		}

	}

}
