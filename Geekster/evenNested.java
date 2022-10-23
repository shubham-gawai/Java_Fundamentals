// print the number - > it is between 0 and 10 and even 
package Geekster;

import java.util.Scanner;

public class evenNested {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ::");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			if (num > 0 && num < 10)
				System.out.println("Num is Even ::");

			}
		else if(num % 2 != 0) {

			System.out.println("Num is odd");
		}
	}
}
