// find the first 7 terms of (N * 6N) where it is divisible by 6 :
package wikiAssignments;

public class feb21_Q6 {
	public static void main(String args[]) {

		int i = 1;
		int count = 0;

		for (i = 1; count < 7; i++) {
			int term = i * 6 * i;
			count++;
			System.out.println(term);

		}

	}
}
