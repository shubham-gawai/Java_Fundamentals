package Geekster;

import java.util.Scanner;

public class inputZeroSumAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum=0;
		for(int i=1;i<10000;i++)
		{
			System.out.println("enter number for addition:");
			num=sc.nextInt();
			sum=sum+num;
			if(num==0)
			{
				System.out.println("sum="+sum);
				break;
				
			}
		}
		
	}

}
