		// count the set bits in the binary number :

package Geekster;

import java.util.Scanner; 
public class countBits {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 int count=0;
		 while(num>0)
		 
			 if((num&1) == 0)
			 {
				 count++;
			 }
			num=num>>1;
				 
			zjjk 
		 {
			 System.out.println(count);
		 } 
		 
	}

}
