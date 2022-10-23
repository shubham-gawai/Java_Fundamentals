package JavaFundaPractice;

public class peakElement {
	public static void main(String args[]) {
		
		int[] a = {1,2,3};// find multiple peak element from the given array
		int n = a.length;
		for (int i = 1; i < n - 1; i++) {

			if (a[0] > a[1]) {// comparing 0 index with index 1
				System.out.println("Debug : i= " + i + " ==>" + a[0] + " --- " + a[i]);
				System.out.print(a[0] + " ");
			}
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				//System.out.println("Debug : i= " + i + " ==>" + a[i - 1] + " --- " + a[i] + "---" + a[i + 1]);

				System.out.print(a[i] + " ");
			}
			if (a[n - 1] > a[n - 2]) {
				//System.out.println("Debug :i= " + i + " ==>" + a[n - 1] + " --- " + a[n - 2]);
				System.out.print(a[n - 1] + " ");

			}

		}

	}
}
