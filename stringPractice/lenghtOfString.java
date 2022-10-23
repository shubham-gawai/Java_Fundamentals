package stringPractice;

import java.util.Scanner;

public class lenghtOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String a = sc.nextLine();

		int L = a.length();
		System.out.println("Length of String :" + L);
	}

}
