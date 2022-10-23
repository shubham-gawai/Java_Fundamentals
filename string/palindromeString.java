package string;

import java.util.Scanner;

class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int k = str.length();

		String rev = "";

		for (int i = (k - 1); i >= 0; --i) {
			rev = rev + str.charAt(i);
		}

		if (str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a Palindrome");
		}
	}kh
}