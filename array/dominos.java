package array;
import java.util.Scanner;

public class dominos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<n;j++) {
				arr[j]=sc.nextInt();
			}
			
		}
	
		for(int j=0; j<n;j++) {
			for(int k=0; k<n;k++) {
				if(arr[j]+arr[k]==n) {
					System.out.println(arr[j]+arr[k]);
				}
			}
			
			
		}
		 
	}

}
