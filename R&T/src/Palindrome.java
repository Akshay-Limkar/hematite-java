import java.util.Scanner;

public class Palindrome{

        public static void main(String[] args){
            
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            System.out.println("Enter String ");
            @SuppressWarnings("unused")
			String s = sc.nextLine();
            
            StringBuffer str1 = new StringBuffer();
            StringBuffer str2 = new StringBuffer();
            str1.reverse();
            
            if(String.valueOf(str1).compareTo(String.valueOf(str2))==0) {
                System.out.println("The String is a Palindrome");
            }else {
                 System.out.println("The String is not a Palindrome");
            }
        }
}