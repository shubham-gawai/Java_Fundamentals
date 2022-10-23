package string;

public class palindromeStrBuilder {

	public static void main(String[] args) {
		String str = "Geekster";

		StringBuilder sbl = new StringBuilder(str);

		System.out.println(sbl.reverse());

		if (str.equalsIgnoreCase(sbl.reverse().toString())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Plindrome");
		}
		jdkjfdf
	}

}
