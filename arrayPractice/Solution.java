package arrayPractice;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
		int T= scan.nextInt();
		for(int i=0; i<T; i++){
			int numofstudents=0;
			int N=scan.nextInt();
			int K=scan.nextInt();
			for(int j=0;j<N; j++){
				int a= scan.nextInt();
				if( a<=0) numofstudents++;
			}
			if(numofstudents < K) System.out.println("YES");
			else System.out.println("NO");
    }
}
}