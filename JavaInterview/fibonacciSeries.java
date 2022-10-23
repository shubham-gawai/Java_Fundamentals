package JavaInterview;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		
		int a = 0, b = 1, c=0;
		System.out.println("Enter any number :");
		int n = sc.nextInt();
		int i;
		
		int sum=0;
		System.out.print(a+" "+b+" ");
		for(i=2; i<=n; i++) {
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			sum = sum + c;
			
		}
		System.out.println();
		System.out.print("sum of the n'th fibonacci numbers :" + sum);

	}
}
