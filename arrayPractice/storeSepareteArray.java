package arrayPractice;

public class storeSepareteArray {

	public static void main(String[] args) {
		int a[] = {34, 22, 43, 78};
		 
		int b[] = new int[a.length];
		
		int j=0;
		for(int i=(a.length-1); i>=0; i--) {
			//System.out.print(a[i]+" ");
			//System.out.println();
			b[j] = a[i];
			
			System.out.print(b[j]+ " ");
		}

	}

}
