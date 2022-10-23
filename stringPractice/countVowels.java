package stringPractice;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vow = sc.nextLine();
		// sc.nextLine();
		int cnt = 0;

		for (int i = 0; i < vow.length(); i++) {
			if (vow.charAt(i) == 'a' || vow.charAt(i) == 'e' || vow.charAt(i) == 'i' || vow.charAt(i) == 'o'
					|| vow.charAt(i) == 'u') {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}