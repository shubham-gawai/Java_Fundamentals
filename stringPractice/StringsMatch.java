package stringPractice;
import java.util.Scanner;
public class StringsMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String [] word1 = {"ab", "cd"};
		String [] word2 = {"a", "bc"};

		String res1 = "";
		String res2 = "";
		for(int i=0; i<word1.length; i++) {
			res1 =word1[0]+word1[1];
			//System.out.println(res1);
		}
		for(int j=0; j<word2.length; j++) {
			res2 =word2[0]+word2[1];
			//System.out.println(res2);
		}
		
		
		if(res1.equals(res2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
