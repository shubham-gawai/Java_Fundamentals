// print the array of count for the elements that,
// how many numbers are smaller are smaller in given array than that element so :

package arrayPractice;

public class countSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 1, 2, 2, 3 };

		int[] sCount = new int[arr.length];

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				System.out.println(max);
			}
		}jkkj
	}
}
