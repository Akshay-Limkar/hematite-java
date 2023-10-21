package assignment_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels {
	
		public static void main(String[] args)
		{
			System.out.println("Enter your name : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			ArrayList<Character> vowels = new ArrayList<Character>();
			
			String v ="aeiou";
			for(int i=0;i<v.length();i++)
			{
				vowels.add(v.charAt(i));
			}
			
			int count = 0;
			for (int i=0; i<str.length(); i++) {
				if(vowels.contains(str.charAt(i))){
					count++;
				}
			}

			System.out.println("Total vowels are : "+count);
		}
}
