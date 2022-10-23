package arrayPractice;

public class sumOf2Array {

	public static void main(String[] args) {
		int a[] = {2, 5, 6, 8, 9};
		int b[] = {5, 4, 9, 2, 6};
		
		int c[] = new int[a.length];
		
		for(int i=0; i<(a.length-1); i++) {
			int sum = a[i]+ b[i];
			//sum = sum + a[i]+ b[i];
			System.out.print(sum + " ");
		}

	}

}
