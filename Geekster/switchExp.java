//switch case expression used when multiple cases fits for one expression :

package Geekster;

import java.util.Scanner;
public class switchExp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day ::");
		int day = sc.nextInt();

		 
		String dayType = switch (day) {

		case 1, 2, 3, 4, 5 -> ("Working day");
		case 6,7 -> ("Off day");
		default -> ("Not valid");	// no need of break statement in the switch expression

		};							// remember this semi-colon after the switch here :
		
		System.out.println(dayType);
	}
		
}
