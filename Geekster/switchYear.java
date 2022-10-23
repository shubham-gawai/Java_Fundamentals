	// do make correction here , it should print the "All subjects are common" 
	// for case 1 and further shouldn't go for any user input and case : 
package Geekster;

import java.util.Scanner;
public class switchYear {
	public static void main(String  args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year ::");
		int year = sc.nextInt();
		
		System.out.println("Enter branch ::");
		String branch = sc.next();
		
		switch(year){
		case 1:
			System.out.println("All subjects are common");
			break;
			
		case 2:
		case 3:
		case 4:
			
				switch (branch) {
				case "IT":
				case "CSE":
					System.out.println("You have opted for computer branch");
					break;
				case "EE":
				case "ECE":
					System.out.println("You have opted for electrical branch");
					break;
				case "MECH":
					System.out.println("You have opted for Mechanical branch");
					break;
				default:
					System.out.println("Invalid branch Input");
					break;
				 
				}
				break;
		default:
			System.out.println("Invalid  year Input");
		}
	}
}
