// write a method to swap two numbers without using third variable :
package methodPract;

import java.util.Scanner;

public class swapNum {

	public static int swapNumbers(int a, int b) {
							 // IP 3 and 4
		a = a + b;			 // 3+4=7
		b = a - b; 			 // 7-4=3
		a = a - b; 			 // 7-3=4

		int swap = a;
		return swap;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter fisrt number :");
		int num1 = sc.nextInt();

		System.out.println("Enter second number :");
		int num2 = sc.nextInt();

		int swap = swapNumbers(num1, num2);

// 		we are swapping num2 -> num1   			i.e. b -> a :

		System.out.println("Swap result :");
		System.out.println(swap);

	}

}
