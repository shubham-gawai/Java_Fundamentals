package JavaFundaPractice;

import java.util.Scanner;

class Employee {
	String name;
	int yoj; 							// year of joining
	String address;

	Employee(String name, int yoj, String address) {
		this.name = name;
		this.yoj = yoj;
		this.address = address;
	}

	void printDetails() {

		System.out.println(name);
		System.out.println(yoj);
		System.out.println(address);
	}
}

public class employeeDet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee em = new Employee();
		Employee em1 = new Employee("A",2021,"pune");
		Employee em2= new Employee("A",2021,"pune");
		em.nextLine();

//		System.out.println("how many Employees you want :");
//		int n = sc.nextInt();
//
//		Employee[] emp = new Employee[n];
//		
//		int x = 0;
//		do {
//		 
//		for (int i = 0; i < n; i++) {
//
//		}
//
//		for (int i = 0; i < n; i++) {
//				System.out.println("Enter Employee name :");
//			String name = sc.nextLine();
//			sc.next();
//				System.out.println("Enter the Year of Joining :");
//			int yoj = sc.nextInt();
//				System.out.println("Enter the address :");
//			String address = sc.nextLine();
//			sc.next();
//
//			em.printDetails();
//			
//		}
//		}while(x==1);
		em.printDetails();
		em1.printDetails();
		em2.printDetails();

	}

}
