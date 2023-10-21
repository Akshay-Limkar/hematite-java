import java.util.Scanner;

public class PrimeNo {

 public static void main(String[] args) {

  int no, count;

  System.out.println("Enter Value of N : ");
  @SuppressWarnings("resource")
  Scanner sc = new Scanner(System.in);
  no = sc.nextInt();
  
  	for(int i=2; i<=no; i++) {
  		count=0;
	for(int j=2; j<=i/2; j++) {
		if(i%j==0) {
			count++;
			break;
    		}
		}
	if(count==0) {
	System.out.println(i);
	}
  }
 }
}

