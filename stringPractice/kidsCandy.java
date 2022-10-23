package stringPractice;

public class kidsCandy {

	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extCandies = 3;

		int[] sumCand = new int[candies.length];
		boolean candiCheck = false;
		for (int i = 0; i < candies.length; i++) {
			for (int j = 0; j < candies.length; j++) {

				sumCand[i] = candies[i] + 3;
				if (sumCand[j] != candies[j] + 3) {
					candiCheck = false;
				} else
					candiCheck = true;
			}
			 jhjgkhv
		}
	}
}
