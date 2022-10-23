package stringPractice;

import java.util.Scanner;

public class charPresentOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1 :");
		String str1 = sc.nextLine();
		
		System.out.println("Enter String 2 :");
		String str2 = sc.nextLine();
		
		//System.out.println(str1.contains(str2));

		if(str1.contains(str2)==true) 
			{
				System.out.println("Present");
			}
		else
			{
				System.out.println("Not present");
			}
	}

}
