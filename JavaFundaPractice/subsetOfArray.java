package JavaFundaPractice;

/*class unionAndInter{
	
	public void union(int[]A, int [] B) {
		
	}	
}

 */
public class subsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 10, 20, 19, 14, 16, 22 };
		int[] B = { 10, 13, 15, 19, 16 };

		/*
		 * for(int i=0; i<A.length; i++) { System.out.print(A[i]+" "); }
		 */
		System.out.println("ame");
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < B.length; j++) {

				
			}
			if (A[i] != B[i]) {
				System.out.print(B[i] + " ");
			}
			
		}

	}

}
