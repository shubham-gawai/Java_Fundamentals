/* WAP to check whether the given number is lesser or greater than 10. 
 * if it is lesser than check further the number is 
 * lesser or greater than 5 
 */
package practiceSesion;

import java.util.Scanner;

public class lesserOrGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number ::");
		int num = sc.nextInt();

		if (num > 10 || num < 10) {
			while (num > 10) {
				System.out.println("It's greater than 10");
				break;
			}
			if (num < 10) {
				System.out.println("It's lesser than 10");
			}
		}
		if (num > 5 || num < 5) {
			while (num > 5) {
				System.out.println("and greater than 5");
				break;
			}
			if (num < 5) {
				System.out.println("and lesser than 5");
			}
		}

	}

}