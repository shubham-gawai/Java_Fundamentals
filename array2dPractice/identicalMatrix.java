// check if the matrices are identical are not : 
package array2dPractice;

public class identicalMatrix {

	public static void main(String[] args) {

		int a[][] = { { 10, 20 }, { 30,40  } };
		int b[][] = { { 10, 20 }, { 30,40 } };
		int c[][] = new int[2][2];					
		int diff;
		int sum = 0;
		
			// step-1 : initializing the difference between matrix a and b :
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				diff = a[i][j] - b[i][j];

			}
			
			// step-2 : first we print matrix c of difference between matrix a and b :
			
			System.out.println("fisrt and second matrix difference :");
			for (i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					c[i][j] = a[i][j] - b[i][j];
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
			
			// step-3 : initializing the sum of all elements in the matrix c : 
			System.out.println("sum of all elements of matrix c :");
			for (i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					sum = sum = c[i][j];

				}

			}
			// step-4 : we are printing the sum of total elements of matrix c :
			// and finally checking if they are identical are not :
			System.out.println(sum);
			if (sum == 0) {
				System.out.println("Matrices are identical");
			} else {
				System.out.println("Matrices are not identical");
			}
		}

	}
}