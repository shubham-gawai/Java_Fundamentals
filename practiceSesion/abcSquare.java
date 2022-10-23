package practiceSesion;

public class abcSquare {

	public static void main(String[] args) {
		 
		int n ='E';
		
		for(int i='A'; i<='C'; i++) {
			char c = (char) i;
			
			for(int j='A'; j<=i; j=j+5) {
				System.out.print(j+  " ");
			}
			System.out.println();
		}

	}

}
