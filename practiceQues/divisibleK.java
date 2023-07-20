package practiceQues;
import java.io.*;
import java.util.Scanner;
class divisibleK {

static int countKdivPairs(int[] A, int n, int K)
{
	int count = 0;

	for (int i = 0; i < n; i++) {
	for (int j = i + 1; j < n; j++) {

		// if pair sum is divisible
		
		if ((A[i] + A[j]) % K == 0 && A[i]==A[j])
		
		// Increment count
		count++;
	}
	}

	return count;
}

public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] A= new int[n];
        
	for(int i=0;i<n;i++){
		A[i]=sc.nextInt();
	} 
	
	int K = sc.nextInt(n);

	// Function call
	System.out.println(countKdivPairs(A, n, K));
}
}

