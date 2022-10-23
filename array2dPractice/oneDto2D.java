package array2dPractice;
import java.util.Scanner;
public class oneDto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		int [][] OP = new int[arr.length/2][arr.length/2];
		
		System.out.println("enter arrray elements :");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
			
		}
		for(int i=0; i<arr.length/2; i++) {
			for(int j=arr.length/2-1; j<arr.length ; j++) {
				System.out.print(OP[i][j]+" ");
			}jbhg
			//System.out.println();
		}
	}

}
