package stringPractice;

public class palindromeCheck1 {

	public static void main(String[] args) {
		String str = "max";
		boolean flag = false;

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = ch.length - 1; j >= 0; j--) {
				if (ch[i] != ch[j]) {
					flag = true;
					//System.out.println(ch[i]);
					//System.out.println(ch[j]);
				}
			}
		}
sdf
		if (flag == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
