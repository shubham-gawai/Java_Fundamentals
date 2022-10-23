// Find the first 3 terms of 4N+9 where it is divisible by 3
package wikiAssignments;

public class feb21_Q1 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; count < 3; i++) {
			int num = 4 * i + 2;
			if (num % 3 == 0) {
				System.out.println(num);
				count++;
			}
		}

	}
}
