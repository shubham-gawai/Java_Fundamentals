package arrayPractice;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class count0and1Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []set = new int[n];
		int cnt=0;
		int cnt1=0;
		//n= set.length;
		for (int i = 0; i <n; i++) {
			set[i] = sc.nextInt();

		}
		for ( int i = 0; i < n; i++) {
			//System.out.print(set[i]+ " ");
			if(set[i]==0) {
				
				cnt++;
			}else if(set[i]==1){
				cnt1++;
			}
		}
		System.out.println(cnt +" "+ cnt1);
	}
}