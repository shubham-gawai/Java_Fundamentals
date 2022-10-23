//write a program to check if the char is vowel or consonant :
// this program only can check the small letters not capital :
package practiceSesion;

import java.util.Scanner;

public class switchVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Alphabet ::");
		char alphabet = sc.next().charAt(0);

		switch (alphabet) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Consonant");

		}

	}
}
