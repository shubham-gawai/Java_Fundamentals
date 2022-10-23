/*WAP a program to print different courses need to be study by 
 * student of different years and branch :
 */

package practiceSesion;

import java.util.Scanner;

public class switchCourse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year ::");
		int year = sc.nextInt();

		System.out.println("Enter Branch ::");
		String branch = sc.next();

		switch (year) {
		case 1:
			System.out.println("Common course");
			break;

		case 2:
		case 3:
		case 4:
			switch (branch) {
			case "CSE":
			case "IT":
				System.out.println("Opted for computer branch ");
				break;

			case "EE":
			case "ECE":
				System.out.println("Opted for Electrical branch ");
				break;
			case "MECH":
				System.out.println("Opted for Mechanical branch ");
				break;
			case "ANE":
			case "ASE":
				System.out.println("Opted for Flying branch ");
				break;
			default:
				System.out.println("not alloted for any course ");
				break;
			}
			break;
		default:
			System.out.println("Invalid details");

		}

	}

}
