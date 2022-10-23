// java program to find the longest repeating sequence in a string :

package stringPractice;

import java.util.Scanner;

public class longRepSequence {

	public static String longestRepetingSequence(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String longest = "";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String x = longestRepetingSequence(s.substring(i, n), s.substring(j, n));

				if (x.length() > longest.length())
					longest = x;

			}
		}
		System.out.println("Longest repeting sequence are :: 5th" + longest);

	}
}
