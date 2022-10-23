package stringPractice;

import java.util.Scanner;

public class upperCase {

	public static void lowerAndUpperCase(String str) {

		char[] arr = str.toCharArray();
		int n = arr.length;

		// loop for UpperCase :
		for (int i = 0; i < n; i++) 
		{

			if (arr[i] >= 65 && arr[i] <= 90) 			 
			{
				arr[i] = (char) (arr[i] -  'a' +  'A');
			}
		}
		
		for (int i = 0; i < n; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
}

	public static void main(String[] args) {

		String str = "HeLlo WoRld";

		lowerAndUpperCase(str);
	}
}
