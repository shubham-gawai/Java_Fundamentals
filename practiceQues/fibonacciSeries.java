package practiceQues;
import java.util.Scanner;
public class fibonacciSeries {
	
	// 0 1 1 2 3 5
	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(a + " " + b); 
		printFibonacciSeries(n - 2);
	}

	public static void printFibonacciSeries(int n) {
		
		if (n > 0) 
		{ 
			c = a + b; 
			System.out.print(" " + c);
			a = b; 
			b = c; 
			printFibonacciSeries(n - 1); 
		}
	
	}
}
