	// find if a given number is power of 2 :

package wikiAssignments;

import java.util.Scanner;
public class feb21_Q3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Number :: ");
		 int num = sc.nextInt();
		 
		 while(num>=2) 
		 {
			 num = num/2;
		// System.out.println(num);
		 }
		 
		 if(num==1)
		 {
			 System.out.println("True");
		 }
		 else 
		 {
			 System.out.println("False");
		 }
		 
	}

}
