package stringPractice;
import java.util.Scanner;
public class palindromeCheck {

	public static boolean isPalindrome(String s) {
		 
		int n=s.length();
		char[] str = s.toCharArray();
		
		int i=0;
		int j=n-1;
		
		while(i<j) {
			if(str[i] != str[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	 }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter s string :");
		 String s = sc.nextLine();
		 
		 boolean isPal = isPalindrome(s);
		 System.out.println(isPal);
	}
	 
}
