/* 
	 1
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6

*/

package practiceSesion;

public class decreNumPyramid {

	public static void main(String[] args) {

		// note this j=(n-1) is used in nested loop cz :
		 
		int n = 6;
		for(int i= 1; i<=n; i++) {
			for (int j = (n - 1); j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}

			System.out.println();

		}
	}

}
