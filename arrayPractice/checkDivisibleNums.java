// check how many elements are divisible by 3 in array :
package arrayPractice;

public class checkDivisibleNums {

	public static void main(String args[]) {

		int set[] = { 23, 45, 100, 96, 21, 34 };
		int count = 0;

		System.out.println("Elements which are divisible by 3 :");
		for (int i = 0; i < set.length; i++) {
			if (set[i] % 3 == 0) {
				System.out.print(set[i] + " ");

			}
		}
		System.out.println();
		for (int i = 0; i < set.length; i++) {
			if (set[i] % 3 == 0) {
				 
			}
			count++;
			System.out.print(count + " ");
		}
do make changes here 
	}
}
