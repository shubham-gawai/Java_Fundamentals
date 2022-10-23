package stringPractice;

public class smallAbiggestPali {
	public static boolean checkPalin(String word) {

		int n = word.length();
		word = word.toLowerCase();
		for (int i = 0; i < n; i++, n--) {
			if (word.charAt(i) != word.charAt(n - 1))
				return false;
		}

		return true;
	}

	public static void lengthPalindrome(int temp, String words[]) {

		int count = 0;
		String smallest = "", longest = "";

		for (int i = 0; i < temp; i++) {

			if (checkPalin(words[i])) {
				count++;

				if (count == 1)
					smallest = longest = words[i];

				else {

					if (smallest.length() > words[i].length())
						smallest = words[i];

					if (longest.length() < words[i].length())
						longest = words[i];
				}
			}
		}
	}
}
