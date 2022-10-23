/* WAP to print the odd and even nimbers in a row as shown  in sample :
  	sample IP : 10
	sample OO : 10 8 6 4 2 0 9 7 5 3 1 
*/

package practiceQues;

import java.util.Scanner;

public class evenOddNumDecre {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number::");
		int num = sc.nextInt();
		
		int temp = num;

		while (num >= 0) {

			if (num % 2 == 0) {
				System.out.print(num + " ");
			
			}
			num--;
			
		}
	 
					
		num = temp;
		while (num >= 0) {

			if (num % 2 != 0) {
				
				System.out.print(num + " ");

			}
			num--;
		}
	}
}
