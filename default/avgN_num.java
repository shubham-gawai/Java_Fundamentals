import java.util.Scanner;
public class avgN_num {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int [] a = new int[3];
		
		for(int i=0; i<3; i++) {
			a [i] = sc.nextInt();
		}
		double d=((a[0]+ a[1] + a[2])/3);
		System.out.println(d);
	}
}

		//print the average of N numbers taking users input (and array) : 