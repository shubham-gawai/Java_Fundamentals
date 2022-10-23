		//check two numbers if they are equal : (using bitwise operator (^))

package Geekster;

import java.util.Scanner;
public class bitwiseOperator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 int c = a^b;
		 if(c==0)
		 {
			 System.out.println("Equal");
			 
		 }
		 else {             
			 System.out.println("Not equal");
		 }
		 
	}

}
