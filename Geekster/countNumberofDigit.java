		// count how many digits are there in the digit :
		// i. e. a=1576 -> 4 digits

package Geekster;

import java.util.Scanner;
public class countNumberofDigit {

	public static void main(String[] args) {
		 
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		 
		int count =0;
		
		 
		while(num >0) { 
			count++;
			num=num/10;
		}
		System.out.println( count );
	}

}
