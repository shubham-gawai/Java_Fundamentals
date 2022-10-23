// make an array with user inputs of size 10 then 
// find sum of all elements in array
package method;

import java.util.Scanner;

public class ArrayCountEven {

	public static int sumArray(int[] set) {
		int sum=0;
		for (int i = 0; i < 10; i++) {

			System.out.print(set[i] + " ");
			sum = sum + set[i];
		}
		
		return sum;
	}
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 
		int [] set = new int[10];
		
		System.out.println("Enter number ::");
		for(int i=0; i<10; i++) {
			
			set[i]= sc.nextInt();
			
		}
		//sumArray(set);
		System.out.println();
		System.out.println(sumArray(set));
		
	 	
	}
	}
