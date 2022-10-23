package OOPsPractice;

abstract class ICICI {
	protected String name;
	protected double balance;
	
	public void details(String name, double balance) {
		System.out.println("Accounr holder's name : " + name);
		//System.out.println("total bank balance :" + balance);
	}
	 
}

class Saving extends ICICI {
	
	public void depositFacility(double depositLimit ) {
		
		System.out.println("depositLimit : " + depositLimit);
	}
	
	public void depositAmt(double amt ) {
		System.out.println("Depositted amount : "+ amt);
		
	}
	public void balAfterDeposit(double bal) {
		
		System.out.println("total balance in account : " +bal);
	}
	
}

class Checking extends ICICI {
	 

	public void depositWithdrawFacility(double WithdrawLimit) {
		
		System.out.println("WithdrawLimit : " + WithdrawLimit);
	}
	
	public void withdrawBalance(double withdraw) {
		 
		System.out.println("my withdrawl : " + withdraw);
	}
	
	public void checkBalanceAfetrWithdrawl(double a, double b) {
		double balanceLeft = a-b;
		System.out.println("balance after withdrawl : " + balanceLeft);
	}
	 
}


public class bankAccount {

	public static void main(String[] args) {
		
		Saving s = new Saving();
		Checking ch = new Checking();
		
		s.details("Shubham Gawai", 100000);
		s.depositFacility(1000000);
		ch.depositWithdrawFacility(90000);
		System.out.println();
		s.depositAmt(25000);
		s.balAfterDeposit(25000);

		System.out.println();
		ch.withdrawBalance(6000);
		ch.checkBalanceAfetrWithdrawl(25000,6000);// this issue must be 
		
//	deposited amount means : total balance - balance withdrawn 
		 
	}
	 
}
