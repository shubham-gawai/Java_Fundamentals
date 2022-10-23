	// write the program, to print the result of statement 
	// of marks as 'Excellent, very good and good' :

package Geekster;

import java.util.Scanner;
public class ternaryOpe {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the marks ::");
		int marks = sc.nextInt();
		
		
		String result;
	    result = (marks>=90 ) ? "Excellent" : ((marks>80 && marks <90) ?  "very good" : "good");
		
		System.out.println(result);
		
	}
}

