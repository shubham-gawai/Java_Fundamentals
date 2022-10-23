// exception handling or error handling is all about to continue the code 
// without breaking at any line by using try, catch , finally :
package exceptionH;

import java.util.Scanner;

public class divideMethod {

	public static void didvide(int a, int b) {

		try {
			System.out.println(a / b);
//divide a number by 0 to see the result 
		} catch (Exception e) {
			System.out.println("exception occured");
		}
		System.out.println(a * b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements :");
		int a = sc.nextInt();
		int b = sc.nextInt();

		didvide(a, b);
	}

}
