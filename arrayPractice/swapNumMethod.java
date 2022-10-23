// Write a method to swap two numbers present in array by passing its indices and array :
package arrayPractice;

public class swapNumMethod {
	public static void SwapArray(int a) {
		int A[] = { 10, 20 };
		int temp = A[0];
		A[0] = A[1];
		System.out.print(A[0] + " ");
		A[0] = temp;
		System.out.print(A[0]);

	}

	public static void main(String[] args) {
		 
		int a = 0;
		SwapArray(a);
	}

}