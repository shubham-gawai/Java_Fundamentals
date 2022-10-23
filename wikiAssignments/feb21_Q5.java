// check if the number is divisible by 2 and 8 but not by 12 :

package wikiAssignments;

import java.util.Scanner;

public class feb21_Q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number ::");
		int num = sc.nextInt();

		String res;
		res = (((num % 2) == 0 && (num % 8) == 0) && (num % 12) != 0) ? ("Divisible") : ("Not Divisible");

		System.out.println(res);
	}

}
