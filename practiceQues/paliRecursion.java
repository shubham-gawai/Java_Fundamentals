package practiceQues;

public class paliRecursion {

	public static void main(String[] args) {

		int n = 121;
		int reversedNumber = reverseNum(n, 0);// reverseNum(121,0)
		if (reversedNumber == n) {// 121==121->true
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static int reverseNum(int n, int reversedNumber) {// n=121 rev=0 //n=12, rev=1 //n=1, rev=12
		if (n == 0) { // 121==0 ->false //12==0->false //1==0->false //0==0->true
			return reversedNumber; // return 121
		}
		reversedNumber = (reversedNumber * 10) + (n % 10);// rev=(0)+(121%10)=>rev=1
		// rev=(1*10)+(12%10)=>rev=10+2=>rev=12
		// rev=(12*10)+(1%10)=>rev=120+1=121
		return reverseNum(n / 10, reversedNumber);// return (12,1) -> return (1, 12) -> return (0,121)

	}

}
