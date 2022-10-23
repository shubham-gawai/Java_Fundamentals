// write a program to print if num is between 0 and 10 and even :
package practiceSesion;

import java.util.Scanner;

public class checkNumEven {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :: ");
		int num = sc.nextInt();

		if(num % 2 == 0) {

			System.out.println("Even");
		} else if (num % 2 != 0) {
			System.out.println("Odd");
		}
		while(num<=10 && num>0) {
			System.out.println("Num is between 0 and 10");
			break;
			}
		if(num>10) {
			System.out.println("Num is greater than 10");
			 
		}
	}
}
