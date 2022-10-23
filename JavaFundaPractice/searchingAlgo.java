package JavaFundaPractice;

public class searchingAlgo {

	public static void main(String[] args) {
		 int arr [][]= { {1,2,3,4,5},{6,7,8,9,11},{13,19,21,30,31},{33,36,39,40,42},{51,33,55,59,60} };
		 int n=arr.length;
		 int d=60;
		 int m=5;
		 for(int i=0; i<n-1; i++){
			 for(int j=0; j<n-1; j++){
				 if(d!=arr[i][j]) {
					 i++;
					 System.out.println("found");
				 }lkl
			 }	 
		} 
	}
}
