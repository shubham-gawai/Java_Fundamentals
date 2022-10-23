package JavaFundaPractice;

public class diagonalEleMatrix {

	public static void main(String[] args) {
		int[][] A = { { 3, 4, 6, }, { 7, 9, 8 }, { 4, 2, 1 } };

		System.out.println("Pricipal Diagonal :");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i == j) {
					System.out.println(A[i][j] + " ");
					;
				}
			}
		}
		System.out.println("Secondary Diagonal :");
		for (int i = A.length; i < A.length; i--) {
			for (int j = 0; j < A.length; j++) {
				 
					System.out.println(A[i][j] + " ");
				}
ljk
			}
	}

}
