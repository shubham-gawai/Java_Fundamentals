package JavaFundaPractice;

public class longestCommon {
	public static void main(String[] args) {
		String a[] = { "gee", "geek", "geekster" };
		int n = a.length;

		String prefix = a[0];
		for (int i = 1; i <= n - 1; i++) {
			prefix = findPrefix(prefix, a[i]);//
		}

		System.out.println("Longest common prefix=" + prefix);
	}

	public static String findPrefix(String s1, String s2) {
		// write a logic to compare s1 ="geek" and s2="gee"
		// Hint: for and if
		int n1 = s1.length();
		int n2 = s2.length();
		String answer = "";
		for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
			if (s1.charAt(i) != s2.charAt(j)) {
				break;
			}
			answer = answer + s1.charAt(i);
		}
		return answer;

	}
}
