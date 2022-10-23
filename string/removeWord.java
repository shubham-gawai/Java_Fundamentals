// Java Program to Remove a Given Word From a String  :
package string;

import java.util.*;
import java.util.Scanner;

public class searchWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("My string :");
		String jake = scan.nextLine();

		System.out.println("searching for a word :");
		String w = scan.nextLine();

		int Index = jake.indexOf(w);

		if (Index == -1) {
			System.out.println(w + " " + "not found in a String jake");
		} else {
			System.out.println("yes," + " " + w + " " + "found at" + " " + "index" + " " + Index);
		}
		scan.close();
	}

}
