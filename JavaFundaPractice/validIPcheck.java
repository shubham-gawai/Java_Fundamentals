package JavaFundaPractice;

public class validIPcheck {
	public static void main(String args[]) {

		String str = "154.78.65.243";

		String s = str.replace(".", " ");
		System.out.println(s);

		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			Integer.parseInt(arr[i]);
			if(arr[i]>=0 && arr[i] <=255) {
				
			}
			System.out.println(arr[i]);
		}
		
		
		 

	}

}
