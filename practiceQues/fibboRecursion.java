package practiceQues;

import java.util.Scanner;

public class fibboRecursion {

	// 0 1 1 2 3 5
	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(a + " " + b);// out of 6 values 2 are printed -- n=4
		printFibonacciSeries(n - 2);// n-2=6-2=4
	}

	public static void printFibonacciSeries(int n) {
		
		// n=4 //n=3 //n=2 //n=1 //n=0
		if (n > 0) {// 4>0-> true //3>0->true //2>0->true //1>0->true //0>0 --> false
			c = a + b;// c=0+1=1 //c=1+1=2 //c=1+2=3 //c=2+3=5
			System.out.print(" " + c);// 1 //2 //3 //5
			a = b;// a=1 //a=1 //a=2 //a=3
			b = c;// b=1 //b=2 //b=3 //b=5
			printFibonacciSeries(n - 1);// 4-1=3 //3-1=2 //2-1=1 //1-1=0
		}
	}

}
