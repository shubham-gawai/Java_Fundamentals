/*

 	* 
 	* * 
 	* * * 
 	* * * * 
 	* * * * * 
 	* * * * 
 	* * * 
 	* * 
 	* 
 
*/ 
package practiceSesion;

public class rightHalfDiamond {

	public static void main(String args[]) {

		int n;

		/*
		 * we will be dividing the shape into half-half two triangles : so for the first
		 * triangle we will be taking n as 5 : and for second one we will be taking n as
		 * 4 : direct we should put the value of n into the condition :
		 */
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		/*the same loops for the second part also works 
		 * the only change is that we have to change the n for 4 :
		 * and the j value will be set as n and j is >= the i value 
		 * j will go in decrement  : 
		 */
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
