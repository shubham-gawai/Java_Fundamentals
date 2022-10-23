package stringPractice;

import java.util.Scanner;

public class mergeTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int i=0, j=0;
		
		while(i<s1.length() || j<s2.length()) {
			
			if(i<s1.length()) {
				System.out.print(s1.charAt(i));
				i++;
			}
			
			if(j<s2.length()) {
				System.out.print(s2.charAt(j));
				j++;
			}
			
		}
		 
	}
// IP : s1 = abc, s2 = def ;
// OP : adbecf
}
