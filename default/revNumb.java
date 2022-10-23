
public class revNumb {

	public static void main(String[] args) {
		int n = 233;
		int rev = 0; 
		
		for( ; n!=0; n=n/10) {
			int rem = n%10;
			rev = rev*10 +rem;
		}
		System.out.println(rev);

	}

}
