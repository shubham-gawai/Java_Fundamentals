package practiceQues;

import java.util.Scanner;
public class stringPlusNum {

		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		int num =sc.nextInt();
		System.out.println("Enter String::");
		String str= sc.next();
		
	//	input num= 150;
	//  input string ="150";
		
		String result =str;
		System.out.println(result);
		
		String result1 = result+num;
		System.out.println(result+num);
		
	}
}