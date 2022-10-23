// print positive numbers only :

package array;

public class positivePrint {

	public static void main(String[] args) {

		int [] chao = {23, 45, -7664 , -44, 4523, 657, 78, -2112, 33, -255 };
		
		int n = chao.length;
		
		for(int i =0; i<n; i++) {
			if(chao[i]>0) {
				System.out.print(chao[i]+ " ");
			}	
		}
		
 
	}

}
