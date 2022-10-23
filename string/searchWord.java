// search a word inside a string :
package string;

import java.util.Scanner;

public class searchWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ::");
		String ella = sc.nextLine();

		boolean isFound;
		System.out.println("searching for a word:");
		String search_w = sc.nextLine();

		{
			System.out.println(ella.contains(search_w));
		}
		  
	}
}
