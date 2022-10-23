package Geekster;

import java.util.Scanner;
public class bitSetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		 
		/*num = num >> (k-1)
		 * if((num&x) !=0)
		 */
		
		 num= num >> (k-1);
		 if((num&1) ==1)
		 {
			 System.out.println("Bit is set");
		 }
		 else {
			 System.out.println("Bit is not set ");
		 }
	}

}
		
		