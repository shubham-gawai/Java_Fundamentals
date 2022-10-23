package Geekster;

public class diamondPattern {

	public static void main(String[] args) {
		 int n=5;
		 int sp=n/2;
		 int st = 1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=sp; j++) {
				System.out.println(" ");
			}
			for(int j=1; j<=s;j++) {
				sp--;
				st = st +2;
				
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}

	}

}
