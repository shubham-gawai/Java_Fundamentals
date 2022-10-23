	// write a program to check if, a number is divisible by 10 and a square of a number is greater than 3 :

package practiceSesion;

import java.util.Scanner;
public class divisibleOrnot {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 
		 String res;
		 
		  res = ((num%10 ==0) && (num*num >3)) ? ("Divisible") : ("Not Divisible");
		 
		 System.out.println(res);
	}

}
