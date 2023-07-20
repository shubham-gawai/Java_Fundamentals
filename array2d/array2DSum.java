package array2d;

public class array2DSum {

	public static int twoDArraySum(int[][] cap) {

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				sum = sum + cap[i][j];
			}

		}
		return sum;

	}

	public static void main(String[] args) {

		int[][] cap1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println(twoDArraySum(cap1));

	}
}
