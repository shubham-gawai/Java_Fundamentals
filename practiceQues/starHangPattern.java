/*
  
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
* 

*/
// WAP to print the solid half diamond shape :

package practiceQues;

public class starHangPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {

				System.out.print("* ");
			}
			System.out.println();

		}
	}

}
