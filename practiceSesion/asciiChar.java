//  Write a program to add 3 to the ASCII value of the any character user provides and print the equivalent character.

package practiceSesion;

import java.util.Scanner;

public class asciiChar {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		{
		System.out.println("Enter a character:");
		}
		
		char ch = sc.next().charAt(0);
		int abc = (int) ch;
		{
		System.out.println("ASCII value of character " + ch + " :: " + abc);
		}
		
		int d = (int) ch + 3;
		{
		System.out.println("Add 3 to ASCII value :: " + d);
		}
		
		char s = (char)d;
		{
		System.out.println("New ASCII character is :: " + s);
		}
	}

}
