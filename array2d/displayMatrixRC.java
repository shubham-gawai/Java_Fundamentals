package array2d;

public class displayMatrixRC {
	public static void main(String args[]) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int r = arr.length; 		 // 2D array size : 3
		// System.out.println(r);
		int c = arr[0].length;		 // for 0th element-size of array itself : 4
		// System.out.println(c);
		int d = arr[1].length; 		 // for 1st element-size of array itself : 4
		// System.out.println(d);
		int e = arr[2].length; 		 // for 2nd element-size of array itself : 4
		// System.out.println(e);

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	 
	}
}
