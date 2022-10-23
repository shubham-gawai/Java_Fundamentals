package Geekster;
public class arraySum {
	public static void main(String args[]) {
		int [] myArr = { 6,42,3,7 };
		int sum = 0;
		for(int x=0; x<myArr.length; x++) {
			sum+=myArr[x];
		}
		System.out.println(sum);
	}
}
		//sum of all elements in array using .length property :
 