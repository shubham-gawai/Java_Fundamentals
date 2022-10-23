package practiceQues;
import java.util.Scanner;
public class missingElemement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//find the missing element : //2,8 // length = 9;
		int [] arr = {0,1,3,4,5,6,7,9};
		int L = arr.length;
		
		int mid = 0;
		for(int i=0; i<L; i++) {
			mid=arr[0] + arr[L-1];
			mid = mid/2;
			
			}
		
//		System.out.println(mid);
		
		for(int i=1; i<=L; i++) {
			 
			 int missing = arr[i]-1;
			 System.out.println(missing);
			  
		}
		
	}
	

}
