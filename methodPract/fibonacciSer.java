package methodPract;

public class fibonacciSer {
	
	public static void fibonacciNumbers(int nextterm)
	
	
	
	
	
	Scanner sc = new Scanner(System.in);
	
	// System.out.println("enter number of terms");
	
	int n = sc.nextInt();
	int i=0,j=1,nextTerm;
	
	// System.out.println("Fibonacci series is ");
	
	
	for(int c = 0;c<n;c++)
	{
		if (c <= 1)
			nextTerm = c;
		else {
			nextTerm = i + j;
			i = j;
			j = nextTerm;
		}
		System.out.print(" " + nextTerm);
	}

}
