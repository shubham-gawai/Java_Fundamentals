// take a pre defined array and print all the array elements :
package array;

public class definedArray {

	public static void main(String[] args) {
		 
		int [] marks = {87,98,100,73,64};
		
		int m = marks.length;
		
		System.out.println("your marks ::");
		
		for(int i=0; i<m; i++) {
			System.out.print(marks[i]+" ");
		}
	 
	}

}
