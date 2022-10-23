package method;

public class isPrime {
		public static boolean primeOrNot(int num) {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		
	
	public static void main(String args[]) {
		
		 boolean result = primeOrNot(4);
		 System.out.println(result);
		
	}
}
