// reverse String Program :
import java.util.Scanner;
public class reverseString {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] arr = text.toCharArray();
		 
		String reverse = " ";
		for(char i:arr)
		 
			reverse = i+ reverse;
				System.out.println(reverse);
		
	}
			//WAP to take a String as an input and output is reverse
			//the given code takes string as an input and converts it into a char array, 
			//which contains letter pf the string as its elements:
}
