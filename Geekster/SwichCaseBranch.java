// taking user input as branch name and printing the name of stream :
package Geekster;

import java.util.Scanner;

public class SwichCaseBranch {

	public static void main(String[] args) {
		
		// (IT, CSE ->computer stream ; EE, ECE -> electrical stream; MECH -> mechanical
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter branch::");
		String branch = sc.next();

		System.out.println("Stream ::");

		switch (branch) {

		case "IT":
		case "CSE":
			System.out.println("Computer Stream");
			break;

		case "EE":
		case "ECE":
			System.out.println("Electrical Stream");
			break;

		case "MECH":
			System.out.println("Mechanical Stream");
			break;

		default:
			System.out.println("Invalid");

		}

	}

}
