// write a program to check if, a number is not negative and divisible by 6 :

package practiceSesion;

import java.util.Scanner;

public class notNegAndDivsible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number ::");
		int num = sc.nextInt();

		String res;
		res = ((num >= 0) && (num % 6 == 0)) ? ("Divisible") : ("Not Divisible");

			if(num>=0) {
				System.out.println("Number is not negative ");
			}
			else {
				System.out.println("Number is negative");
			}
		System.out.println(res);

	}

}
