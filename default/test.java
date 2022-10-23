import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
		String str = "";
		int max = 0;
		String ans = "";
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				str = sc.next();
				for (int k = 0; k < str.length(); k++) {
					char ch = str.charAt(k);
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
							|| ch == 'I' || ch == 'O' || ch == 'U') {
						count++;
					}
				}
			}
			if (count > max) {
				max = count;
				ans = str;
			}
			System.out.println(ans);
		}
	}
}