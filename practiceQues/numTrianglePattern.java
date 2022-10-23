 /*1
  * 1 2
  * 1 2 3 
  * 1 2 3 4 
  * 1 2 3 4 5 
  * 1 2 3 4 5 6  pattern :
  */
package practiceQues;

public class numTrianglePattern {
	public static void main(String args[]) {
		
		int num = 6;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();

		}

	}
}
