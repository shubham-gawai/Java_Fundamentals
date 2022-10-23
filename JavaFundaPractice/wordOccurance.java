package JavaFundaPractice;

public class wordOccurance {

	public static void main(String[] args) {

		// OP : welcome -> 2 times (see the first one is uppercase)
		String s = "Welcome to my world. You are always welcome anytime";
		String str = s.substring(0);
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str == "Welcome" || str =="welcome") {
				count++;
			}
		}
		System.out.println(count);

	}

}
.m