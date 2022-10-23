//replace a substring inside a string by another one :
package string;

import java.util.Scanner;

public class replaceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input string ::");
		String pearl = sc.nextLine();

		System.out.println("word u want to replace :");
		String w_To_Rep = sc.nextLine();

		System.out.println("by word :");
		String w_Rep_by = sc.nextLine();
		{
			System.out.println(pearl.replace(w_To_Rep, w_Rep_by));
		}

	}

}
