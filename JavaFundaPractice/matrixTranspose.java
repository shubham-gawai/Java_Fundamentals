package JavaFundaPractice;

public class matrixTranspose {

	public static void main(String[] args) {
		int[][] A = { { 3, 4, 6, }, { 7, 9, 8 }, { 4, 2, 1 } };

		System.out.println("Pritning Matrix :");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {

				System.out.print(A[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("Transpose of a Matrix :");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(A[i][j]==)
				System.out.print(A[j][i] + " ");

			}
			System.out.println();
		}
	}

}